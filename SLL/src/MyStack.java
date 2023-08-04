public class MyStack {
    // fields
    private SinglyLinkedList data = new SinglyLinkedList();
    private int count = 0;




    //  methods / action
    //push - O(1)
    public void push(String newValue)
    {
        count++; // added a new element
        data.addFirst(newValue);
    }

    //pop - O(1)
    public String pop() throws Exception
    {
        count--; // what if the list is empty?
        String ret = data.getHead().value;
        data.deleteFirst();
        return ret;
    }

    //peek - O(1)
    public String peek()
    {
        return data.getHead().value;
    }

    //clear - O(1)
    public void clear()
    {
        count = 0;
        data.clear();
    }

    //isEmpty - O(1)
    public boolean isEmpty()
    {
        return data.isEmpty();
    }

    //getCount - O(1)
    public int getCount()
    {
        return count;
    }

    

    // constructors
}
