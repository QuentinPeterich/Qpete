public class SinglyLinkListWithTail {
        // data
        private Node head;
        private Node tail;



        // methods

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
        { // create new node
            Node node = new Node(newValue);
            if(isEmpty()) // if empty, were adding the first node
            {
                tail = node;
                head = node;
            }
            else {

            // point the new node to the head
            node.next = head;
            // make the head point to the new node
            head = node;
            }
        }
        //addLast
        public void addLast(String newValue) // running time of O(1)
        { // if the list is empty, addFirst value
            if(isEmpty())
            {
                addFirst(newValue);
            } else {

                Node node = new Node(newValue);// create a new node
                tail.next = node; // have the last node point to new node (link it)

                //update the tail
                tail = node;
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
        public void clear() // O(1)
        {
            head = null;
            tail = null;
        }


        //deleteFirst
        public void deleteFirst() throws Exception // running time O(1)
        {
            if(isEmpty())
            {
                throw new Exception("You cannot delete from an empty list.");
            } else if(tail == head) // we only have one node
            {
                head = tail = null;
            }
                else{
                    head = head.next;
                }
            }


        //deleteLast
        public void deleteLast() throws Exception // O(n)
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
                //move the tail
                tail = finger;
            }
        }




        // constructors







    }

