import java.util.ArrayList;

public class Graph {
    //data - G = (V- vertices, E- edges)
    ArrayList<String> V = new ArrayList<String>();
    ArrayList<ArrayList<Integer>> E = new ArrayList<ArrayList<Integer>>();


    //methods
    //addVertex
    public void addVertex(String label)
    {
        //add a new entry to V
        V.add(label);

        E.add(new ArrayList<Integer>() );
    }

    //addEdge
    public void addEdge(String labelFrom, String labelTo) throws Exception
    {
        //find index for labelFrom and labelTo
        int indexFrom = V.indexOf(labelFrom);
        int indexTo = V.indexOf(labelTo);
        //check that the label exists in V
        if(indexFrom == - 1) throw new Exception(labelFrom + " not found");
        if(indexTo == - 1) throw new Exception(labelTo + " not found");

        // add these indices into E
        E.get(indexFrom).add(indexTo);
        E.get(indexTo).add(indexFrom);

    }
    public void removeEdge(String labelFrom, String labelTo) throws Exception
    {
        //find index for labelFrom and labelTo
        int indexFrom = V.indexOf(labelFrom);
        int indexTo = V.indexOf(labelTo);
        //check that the label exists in V
        if(indexFrom == - 1) throw new Exception(labelFrom + " not found");
        if(indexTo == - 1) throw new Exception(labelTo + " not found");

        // remove them
        E.get(indexFrom).remove(E.get(indexFrom).indexOf(indexTo));
        E.get(indexTo).remove(E.get(indexTo).indexOf(indexFrom));

    }
    //removeEdge
    //removeVertex


    //Print
    public void Print()
    {
        // display V
        System.out.print("V = {");
        for(String s : V)
        {
            System.out.print(s + ", ");
        }
        System.out.println("}"); // move to the nest line


        //display E
        System.out.println();
        System.out.println("Adjacency list:");
        int index = 0;
        for(var list : E) // goes over each list in E
        {

            System.out.print("List for " + V.get(index) + "-> ");
            for(var idx : list)
            {
                System.out.print(V.get(idx) + ", ");
            }
            System.out.println();

            index++;
        }


    }






    //ctors
}