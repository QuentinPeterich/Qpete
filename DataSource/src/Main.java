/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        double[] numbers = {22, 11, 110, 6, 17, 10, 18}; // O(1 or n)
        SelectionSort(numbers); //sorts the array using Bubble Sort // O(n^2)
        PrintArray(numbers); //display the sorted array // O(n)
    }

    public static void SelectionSort(double[] array) {
        // for position 0
        // find position of smallest value in array
        for(int j = 0; j < array.length - 1; j++)
        // j is the starting position each run
        {
            int min_pos = j;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[min_pos]) // if we find something smaller,
                {
                    // save position
                    min_pos = i;
                }
            }
            //swap elements at position 0 and min_position
            double tmp = array[0];
            array[0] = array[min_pos];
            array[min_pos] = tmp;
        }
        }

    public static void BubbleSort(double[] array)
    {
        //traverse the array
        for(int time = 0; time < array.length - 1; time++)
        {
            for(int i=0; i<array.length - 1 ;i++)
            {
                if(array[i] > array[i+1])
                {
                    //swap the elements at position i and i+1
                    double tmp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = tmp;
                }
            }
        }
    }
    public static void BubbleSort3(double[] array) // running time is O(n^2), best case is O(n)/Big omega(n)
    {
        //traverse the array
        for(int time = 0; time < array.length - 1; time++)
        {
            boolean didSwap = false;
            for(int i=0; i<array.length - 1 - time ;i++)
            {
                if(array[i] > array[i+1])
                {
                    //swap the elements at position i and i+1
                    double tmp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = tmp;
                    didSwap = true; // set the flag, we swapped the values
                }
            }
            // did we do any swaps?
            if(!didSwap) // no swaps done in one run = array is now sorted
            {
                break; // leave the loop, we are done
            }
        }
    }

    public static void PrintArray(double[] array)
    {
        //traverse the array
        for(int i = 0; i< array.length; i++)
        {
            //display the value of the array at the index i
            System.out.print( array[i] +" ");
        }
        System.out.println();//move to the next line
    }
}