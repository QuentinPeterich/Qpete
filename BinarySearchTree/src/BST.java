public class BST {
    //data
    Node root;

    //methods

    //algorithms
    // CountNodes
    public int CountNodes() // running time O(n)
    {
        return CountNodesHelper(root);
    }

    public int CountNodesHelper(Node current) // running time O(n)
    {
        if(current != null)
        {
            return CountNodesHelper(current.left) + CountNodesHelper(current.right) + 1; // get the number of nodes on the left side, then the right side then add 1 for the root
        }
        else
        {
            return 0;
        }
    }

    // CountLeafNodes (nodes that do not have children)
    public int CountLeafNodes()
    {
        return CountLeafNodesHelper(root);
    }

    public int CountLeafNodesHelper(Node current) // running time O(n)
    {
        if(current == null)
        {
            return 0;
        } else if(current.left == null && current.right == null)
        {
            return 1;
        } else
        {
            return CountLeafNodesHelper(current.left) + CountLeafNodesHelper(current.right);
        }
    }

    // FindHeight
    public int FindHeight()
    {
        return FindHeightHelper(root);
    }

    public int FindHeightHelper(Node current)
    {
        if(current == null)
        {
            return -1;
        } else
        {
            return Math.max(FindHeightHelper(current.left),
                            FindHeightHelper(current.right)) + 1;
        }
    }


    // sum of all values
    public int NumberOfAllLetters() // running time O(n)
    {
        return NumberOfAllLettersHelper(root);
    }

    public int NumberOfAllLettersHelper(Node current)
    {
     if(current == null)
     {
         return 0;
     } else
     {
        // divide and conquer
         return current.value.length() + // will get the length of the value of the current pointer
        NumberOfAllLettersHelper(current.left) + // then it will move to the left of the current
        NumberOfAllLettersHelper(current.right); // then it will move to the right of the current and then restart the method
     }
    }



    //Delete - skip
    //Clear
    public void Clear() // running time O(1)
    {
        root = null;
    }

    //IsEmpty
    public boolean IsEmpty() // running time O(1)
    {
        return root == null;
    }

    //Search
    public Node Search(String valueSearched) // running time O(n)
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


    public boolean Search2(String value) // running time is O(n)
    {
        return Search(value) != null;
    }

    //Insert
    public void Insert(String someValue) // running time is O(n)
    {
        Node node = new Node(someValue);//create a new node

        if(IsEmpty())
        {
            root = node; //make root point to the new node
            // root =new Node(someValue);
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
    //Max/Min
    public String Max() throws Exception // running time O(n)
    {
        Node finger = root;
        if(IsEmpty())
        {
            throw new Exception("no max in empty tree");
        }
        else
        {
            while(finger.right != null)
            {
                finger = finger.right;
            }

            //finger now points at right most node
            return finger.value;
        }
    }

    public String Min() throws Exception // running time O(n)
    {
        Node finger = root;
        if(IsEmpty())
        {
            throw new Exception("no min in empty tree");
        }
        else
        {
            while(finger.left != null)
            {
                finger = finger.left;
            }

            //finger now points at left most node
            return finger.value;
        }
    }




    //Traversals
    //PreOrder - NLR
    public void PreOrder() // running time O(n)
    {
        PreOrderHelper(root);
    }
    public void PreOrderHelper(Node current) // think of current as "finger" // running time O(n)
    {
        if(current != null)
        {
            System.out.println(current.value); //L - visit the node
            PreOrderHelper(current.left); //L - Visit the left subtree
            PreOrderHelper(current.right); //R - Visit the right subtree
        }
    }

    //InOrder - LNR
    public void InOrder() // running time O(n)
    {
        InOrderHelper(root);
    }
    public void InOrderHelper(Node current) // think of current as "finger" // running time O(n)
    {
        if(current != null)
        {
            PreOrderHelper(current.left); //L - Visit the left subtree
            System.out.println(current.value); //L - visit the node
            PreOrderHelper(current.right); //R - Visit the right subtree
        }
    }

    //PostOrder - LRN



    //CountLeafNodes
    //FindHeight




    //ctor
}