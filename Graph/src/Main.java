
public class Main {
    public static void main(String[] args) throws Exception{
        Graph g = new Graph();
        g.addVertex("Lacey");
        g.addVertex("Seattle");
        g.addVertex("Fort Worth");
        g.addVertex("Orlando");
        g.addVertex("Destin");

        g.addEdge("Lacey", "Seattle");
        g.addEdge("Orlando", "Destin");
        g.addEdge("Orlando", "Fort Worth");

        g.Print();
    }
}