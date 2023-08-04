public class MyArrayList {
    // fields - store date / Characteristics
    int capacity; // how big the array is
    private int count; // the number of elements in the array
    private int[] data; // an array that will store out values


    // methods - actions/ what can they do?

    public int getCount()
    {
        return count;
    }

    public int getCapacity()
    {
        return data.length;
    }


    // isEmpty
    public boolean isEmpty() // running time: O(1)
    {
//        if(count == 0)
//            return true;
//        else
//            return false;
        return count == 0;
    }

    // isAtCapacity
    public boolean isAtCapacity() // running time: O(1)
    {
        return count == getCapacity();

    }


    // add
    public void add(int newValue) // running time: O(n)
    {
        if(isAtCapacity()) // is the array full?
        {
            resize();
        }

        // we know the array is not full
        data[count] = newValue;
        count++;

    }

    public void resize() // running time: O(n)
    {
        // create a temp array with twice capacity
        int[] tmp = new int[2 * getCapacity()];

        // copy values from data into temp
        for(int i = 0; i < count; i++)
        {
            tmp[i] = data[i];
        }

        // make tmp be your data
        data = tmp;

    }





    //////////
    // addLast

    public void addLast(int newValue) // running time: O(n)
    {
        add(newValue);

    }
    //Display

    public String toString() // running time: O(n)
    {
        String ret = "";

        for(int i = 0; i < count; i++)
        {
            ret += data[i] + " ";
        }
        return ret;
    }
    //addFirst
    public void addFirst(int newValue) // running time: O(n)
    {
        insert(newValue, 0);
    }


    //Insert
    public void insert(int newValue, int position) // running time: O(n)
    {
        if(position < 0 || position > count)
            throw new IndexOutOfBoundsException("Cant do that. You cant add values past the count");
        // if full, resize
        if(isAtCapacity())
        {
            resize();
        }
        // shift values to the right one position
        for(int i = count - 1; i >= position; i--)
        {
            data[i+1] = data[i];
        }
        // insert the newValue into position 0
        data[position] = newValue;
        count ++;

    }


    //clear
    public void clear() // running time: O(1)
    {
        count = 0;
    }

    //delete



    // constructor - used to initialize/ build them

    //constructor
    public MyArrayList() {
        capacity = 8;
        data = new int[8];
        count = 0;

    }








}
