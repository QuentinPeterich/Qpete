public class Main {
    public static void main(String[] args) {
//        Node node = new Node("Chad");
        BST tree = new BST();

        tree.Insert("Chad");
        tree.Insert("Harry");
        tree.Insert("Gyula");
        tree.Insert("Garry");
        tree.Insert("Susan");
        tree.Insert("Whitney");
        tree.Insert("Flavia");
        tree.Insert("Hazel");
        tree.Insert("Sage");

        tree.InOrder();
//        tree.Clear();
        System.out.println(tree.Search2("Alex")); // false
        System.out.println(tree.Search2("Harry")); // true
        System.out.println(tree.CountNodes());



    }
}