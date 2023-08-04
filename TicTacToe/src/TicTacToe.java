import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class TicTacToe extends JFrame {
    // fields
    JPanel mainPanel = new JPanel(); // this will hold the buttons
    JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    String currentPlayer = "X";
    Font font4Buttons = new Font(Font.SERIF, Font.BOLD, 100);

    JMenuBar mainMenu = new JMenuBar();
    JMenu file = new JMenu("File");
    JMenu edit = new JMenu("Edit");
    JMenu help = new JMenu("Help");

    JMenuItem reset = new JMenuItem("Reset");
    JMenuItem exit = new JMenuItem("Exit");
    JMenuItem somethingElse = new JMenuItem("Something Else");






    // methods
    public void SwitchPlayer()
    {
        if(currentPlayer == "X")
        {
            currentPlayer = "O";
        }
        else {
            currentPlayer = "X";
        }
//        currentPlayer = (currentPlayer =="X")?"O":"X";
    }

    public boolean CheckForWinner()
    {   // check 1st row
        if(btn1.getText() == btn2.getText()
                && btn1.getText() == btn3.getText()
                 && btn1.getText() != "")
            return true;

        // Check for 2nd row
        if(btn4.getText() == btn5.getText()
                && btn4.getText() == btn6.getText()
                && btn4.getText() != "")
            return true;

        // Check for the 3rd row
        if(btn7.getText() == btn8.getText()
                && btn7.getText() == btn9.getText()
                && btn7.getText() != "")
            return true;


        // check 2nd column
        if(btn1.getText() == btn4.getText()
                && btn1.getText() == btn7.getText()
                && btn1.getText() != "")
            return true;

        // check for 2nd column
        if(btn2.getText() == btn5.getText()
                && btn2.getText() == btn8.getText()
                && btn2.getText() != "")
            return true;

        // check 3rd column
        if(btn3.getText() == btn6.getText()
                && btn3.getText() == btn9.getText()
                && btn3.getText() != "")
            return true;

        // check first diag
        if(btn1.getText() == btn5.getText()
                && btn1.getText() == btn9.getText()
                && btn1.getText() != "")
            return true;

        // check 2nd diag
        if(btn3.getText() == btn5.getText()
                && btn3.getText() == btn7.getText()
                && btn3.getText() != "")
            return true;

        return false;
    }


    //click event handler
    public void ButtonClickHandler(ActionEvent e)
    {
        JButton theButtonClicked = (JButton)e.getSource();
        theButtonClicked.setEnabled(false); // disable the button once clicked
        theButtonClicked.setText(currentPlayer); // display x or o on the button
        theButtonClicked.setBackground(currentPlayer.equals("X")?Color.RED:Color.GREEN);// set color for the button
        theButtonClicked.setOpaque(true);
        if(CheckForWinner())
        {
            JOptionPane.showMessageDialog(null,currentPlayer + " Wins!");

            //disable all buttons
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);


        }
        SwitchPlayer();
    }

    public void someMethod()
    {
        JOptionPane.showMessageDialog(this, "Hello");
    }


    // constructors
    public TicTacToe()
    {
        super();

        setContentPane(mainPanel);

        //build 9 buttons
        btn1 = new JButton(); btn1.addActionListener(e -> ButtonClickHandler(e)); btn1.setFont(font4Buttons);
        btn2 = new JButton(); btn2.addActionListener(e -> ButtonClickHandler(e)); btn2.setFont(font4Buttons);
        btn3 = new JButton(); btn3.addActionListener(e -> ButtonClickHandler(e)); btn3.setFont(font4Buttons);
        btn4 = new JButton(); btn4.addActionListener(e -> ButtonClickHandler(e)); btn4.setFont(font4Buttons);
        btn5 = new JButton(); btn5.addActionListener(e -> ButtonClickHandler(e)); btn5.setFont(font4Buttons);
        btn6 = new JButton(); btn6.addActionListener(e -> ButtonClickHandler(e)); btn6.setFont(font4Buttons);
        btn7 = new JButton(); btn7.addActionListener(e -> ButtonClickHandler(e)); btn7.setFont(font4Buttons);
        btn8 = new JButton(); btn8.addActionListener(e -> ButtonClickHandler(e)); btn8.setFont(font4Buttons);
        btn9 = new JButton(); btn9.addActionListener(e -> ButtonClickHandler(e)); btn9.setFont(font4Buttons);

        // add them to the main panel
        mainPanel.add(btn1);
        mainPanel.add(btn2);
        mainPanel.add(btn3);
        mainPanel.add(btn4);
        mainPanel.add(btn5);
        mainPanel.add(btn6);
        mainPanel.add(btn7);
        mainPanel.add(btn8);
        mainPanel.add(btn9);


        setJMenuBar(mainMenu);
        mainMenu.add(file);
        file.add(edit);
        file.add(reset);
        reset.addActionListener(e -> someMethod());
        file.add(exit);
        mainMenu.add(help);
        help.add(somethingElse);

        //add a layout to the main panel 
        mainPanel.setLayout(new GridLayout(3, 3));



        setTitle("CSC205 TicTacToe"); // leave this for the end
        setSize(500, 500);
        setLocation(100, 100);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

    }




}
