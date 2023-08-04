// Quentin Peterich
public class DoublyLinkedList {
    private Node head;
    private Node tail;

    private static class Node
    {
        String value; // value stored in this node
        Node next; // the next node in the list after this one
        Node prev; // the previous node in the list before this one

        // constructor for creating a new node
        Node(String value)
        {
            this.value = value; // set the node value
            this.next = null; // theres no next node(end of list)
            this.prev = null; // no previous node (beginning of the list)
        }
    }

        // isEmpty
    public boolean isEmpty() {
        // If the head is null, that means the list is empty
        return head == null;
    }

    // addFirst
    public void addFirst(String newValue)
    {
        Node node = new Node(newValue);
        if(isEmpty())
        {
            tail = node; // if list was empty the new node is not also the tail
        } else {
            head.prev = node; // existing heads prev pointer should be updated
        }
        node.next = head;
        head = node; // new node becomes the new head
    }

    // addLast
    public void addLast(String newValue)
    {
        Node node = new Node(newValue);
        if(isEmpty())
        {
            head = node; // if list is empty the new node is now also the head
        } else {
            tail.next = node; // existing tails next pointer should be updated
            node.prev = tail;
        }
        tail = node; // new node becomes the new tail
    }

    // Clear
    public void clear()
    {
        head = null;
        tail = null;
    }

    // delete first
    public void deleteFirst() throws Exception
    {
        if(isEmpty())
        {      // throw an exceptions if theres nothign to delete
            throw new Exception("The list is already empty");
        } else {
            // set head to the next node in the list
            head = head.next;
            if(head != null)
            { // if the list isnt empty after deletion, set the new heads prev to null
                head.prev = null;
            } else {
                // if the list is empty after deletion, set tail to null
                tail = null;
            }
        }
    }

    // delete last
    public void deleteLast() throws Exception
    {
        if(isEmpty())
        { // throw exception if there nothing to delete
            throw new Exception("The lis is already empty");
        } else if(head.next == null)
        {
            // if theres 1 node in the list, set head and tail to null
            head = null;
            tail = null;
        } else {
            // set tail to the previous node in the list and set its next to null
            tail = tail.prev;
            tail.next = null;
        }
    }
    // delete
    public void delete(String value) throws Exception {
        if(isEmpty()) {
            return; // if the list is empty, there's nothing to delete
        }

        if(head.value.equals(value)) { // if head contains the value delete the first
            try {
                deleteFirst();
            } catch(Exception e) {
                e.printStackTrace();
            }
            return;
        }

        Node finger = head.next;
        while(finger != null) {
            if(finger.value.equals(value)) { // if we found the node
                finger.prev.next = finger.next;
                if (finger.next != null) { // if it's not the last node
                    finger.next.prev = finger.prev;
                } else { // if it is the last node
                    tail = finger.prev;
                }
                return;
            }
            finger = finger.next; // move to the next node
        }
    }
    // delete with node
    public void delete(Node node) throws Exception {
        if (node == null) {
            throw new Exception("The node to delete cannot be null.");
        }

        if (isEmpty()) {
            throw new Exception("The list is empty. There's nothing to delete.");
        }

        // Special case if the node to be deleted is the head
        if (head == node) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null; // if the list becomes empty after deleting the head, set tail to null as well
            }
            return;
        }

        // Special case if the node to be deleted is the tail
        if (tail == node) {
            tail = tail.prev;
            if (tail != null) {
                tail.next = null;
            } else {
                head = null; // if the list becomes empty after deleting the tail, set head to null as well
            }
            return;
        }

        // If the node to be deleted is not the head or the tail
        Node nextNode = node.next;
        Node prevNode = node.prev;

        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }

    // reverse
    public void reverse() {
        if(isEmpty()) {
            return; // if list is empty, nothing to reverse
        }

        Node current = head;
        Node temp = null;
        while(current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        // swap head and tail pointers
        temp = head;
        head = tail;
        tail = temp;
    }
    // print
    public void print() {
        if(isEmpty()) {
            System.out.println("The list is empty"); // print a message if the list is empty
        } else {
            Node finger = head; // start at head of the list
            while(finger != null) { // while theres another node in the list
                System.out.print(finger.value + " "); // print its value
                finger = finger.next; // move on to the next node
            }
            System.out.println(); // print new line at the end
        }
    }
}
