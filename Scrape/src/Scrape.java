import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Scrape extends JFrame {
    //data
    final int WIDTH = 800, HEIGHT=800;
    JPanel jpanelMain;
    JTextField tfURL = new JTextField();
    JTable tblResults;
    DefaultTableModel tblModel;
//    JTextField tfRegex;
    JButton btnSubmit;
    String[] regValues = {"[0-9]{3}-[0-9]{3}-[0-9]{4}","[a-zA-Z]+@stmartin\\.edu","[a-zA-Z]+@[a-zA-Z]+\\.[a-zA-Z]"};
    JComboBox cbREGEX = new JComboBox(regValues);

    //methods

    public static void main(String[] args) {
        setCrossPlatformLook();
        Scrape game = new Scrape();

    }

    public void ButtonClickedJBLM(ActionEvent e) throws Exception
    {
        //open up the page shown by tfURL
        URL url = new URL(tfURL.getText());
        URLConnection connection = url.openConnection();
        InputStream is = connection.getInputStream();

        try(BufferedReader br = new BufferedReader(new InputStreamReader(is)))
        {
            String line = null;
            while( (line = br.readLine()) != null)
            {
                // phones: "[0-9]{3}-[0-9]{3}-[0-9]{4}"
                // emails: "[a-zA-Z]+@stmartin\\.edu"
                Matcher m = Pattern.compile(cbREGEX.getSelectedItem().toString()).matcher(line);
                while(m.find())
                {
                    tblModel.insertRow(tblModel.getRowCount(), new Object[]{String.valueOf(tblModel.getRowCount() + 1), m.group()});
                }
            }
        }

        //using tfREGEX, find all matches and populate the table


    }

    //ctor
    public Scrape() {
        jpanelMain = new JPanel(new BorderLayout());
        add(jpanelMain);//add the panel to the main JFrame
        //   ------------------------   NORTH --------------
        jpanelMain.add(tfURL, BorderLayout.NORTH);
        tfURL.setText("https://www.stmartin.edu/directory/faculty-staff-directory");

        //   ------------------------   CENTER -------------
        tblModel = new DefaultTableModel();
        tblModel.addColumn("#");
        tblModel.addColumn("RESULTS");

        tblResults = new JTable(tblModel);

        JScrollPane scrollbar = new JScrollPane(tblResults);

        jpanelMain.add(scrollbar, BorderLayout.CENTER);
        //   ------------------------   SOUTH --------------
//        tfRegex = new JTextField(50);
        btnSubmit = new JButton("Click me!");
        btnSubmit.addActionListener(e->
                {
                    try{ButtonClickedJBLM(e);}
                    catch(Exception exc){exc.printStackTrace();}
                }
        );

        JPanel jpanelSouth = new JPanel();
        jpanelSouth.add(cbREGEX);
        jpanelSouth.add(btnSubmit);
        jpanelMain.add(jpanelSouth, BorderLayout.SOUTH);

        //leave this last
        setTitle("CSC205 - Scrape it");
        setSize(WIDTH, HEIGHT);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void setCrossPlatformLook() {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}