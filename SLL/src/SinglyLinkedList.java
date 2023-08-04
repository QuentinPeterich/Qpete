public class SinglyLinkedList {
    // data
    private Node head;


    // methods
    public Node getHead()
    {
        return head;
    }

    //isEmpty
    public boolean isEmpty() { // running time O(1)
/*
        if(head == null)
        {
            return true;
        } else {
            return false;
        }
*/
        return head == null;
    }
    //addFirst
    public void addFirst(String newValue) // running time O(1)
    {
        // create new node
        Node node = new Node(newValue);
        // point the new node to the head
        node.next = head;
        // make the head point to the new node
        head = node;
    }
    //addLast
    public void addLast(String newValue)
    { // if the list is empty, addFirst value
        if(isEmpty())
        {
            addFirst(newValue);
        } else { // else do the traverse
            // traverse to find the last node
            Node finger = head;
            while (finger.next != null) // while the next node the finger is checking is not equal to null, move forwards
            {
                finger = finger.next; // move finger to the right
            }
            Node node = new Node(newValue);// create a new node
            finger.next = node; // have the last node point to new node (link it)
        }
    }
    //print
    public void print() // running time O(n)
    {
        if(isEmpty()) // running time O(1)
        {
            System.out.println("The list is empty");
        }
        else
        { // running time O(n)
            Node finger = head; // finger starts at the head
            while(finger != null) { // does finger point to a node?
                System.out.print(finger.value + " ");// read the value out loud
                finger = finger.next; //move the finger to the right
            }
            System.out.println();
        }
    }

    //clear
    public void clear()
    {
        head = null;
    }


    //deleteFirst
    public void deleteFirst() throws Exception {
        if(isEmpty())
        {
            throw new Exception("You cannot delete from an empty list.");
        } else {
            head = head.next;
        }
    }

    //deleteLast
    public void deleteLast() throws Exception
    {
        if(isEmpty()) // if already empty
        {
            throw new Exception("The list is already empty");
        }
        else if(head.next == null) // if head.next is null meaning there is only one left in the list
        {
            deleteFirst();
        }
        else
        {
            Node finger = head;

            // moves finger from head to the next to last node
            while(finger.next.next != null)
            {
                finger = finger.next; // moves finger to the right
            }
            // link out the last node
            finger.next = null;
        }
    }




    // constructors







}
