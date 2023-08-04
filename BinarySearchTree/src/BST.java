public class BST {
    //data
    Node root;

    //methods
    //Delete - skip
    //Clear
    public void Clear()
    {
        root = null;
    }

    //IsEmpty
    public boolean IsEmpty()
    {
        return root == null;
    }

    //Search
    public Node Search(String valueSearched)
    {
        Node finger = root;

        while(finger!=null) //does finger point to a node?
        {
            if(finger.value.equals(valueSearched))  //check its value
            {
                return finger;//found it!
            }
            else if(valueSearched.compareTo(finger.value)<0)
            {
                finger = finger.left;//go left
            }
            else
            {
                finger = finger.right;//go right
            }
        }
        //we get here when finger points to null
        return null;
    }


    public boolean Search2(String value)
    {
        return Search(value) == null;
    }

    //Insert
    public void Insert(String someValue)
    {
        Node node = new Node(someValue);//create a new node

        if(IsEmpty())
        {
            root = node; //make root point to the new node
            //root =new Node(someValue);
        }
        else
        {
            //start at the root
            Node finger = root;

            while(true) //traverse the tree
            {
                if(someValue.compareTo(finger.value)  <=  0)
                {
                    if(finger.left!=null)//is there a left node???
                    {
                        finger = finger.left; //if there is a left node then move finger to left
                    }
                    else
                    {
                        //if there is no left node then link in new node to the left
                        finger.left = node;
                        break; //done with the loop
                    }
                }
                else
                {
                    if(finger.right!=null)//is there a right node???
                    {
                        finger = finger.right; //if there is a right node then move finger to right
                    }
                    else
                    {
                        //if there is no right node then link in new node to the right
                        finger.right = node;
                        break; //done with the loop
                    }
                }
            }
        }
    }

    //Traversals
    //CountLeafNodes
    //FindHeight

    //Max/Min


    //ctor
}