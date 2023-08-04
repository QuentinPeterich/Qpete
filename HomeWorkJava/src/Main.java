import java.util.*;

// Quentin Peterich
public class Main {
    public static void main(String[] args) {
        // creating the string array to work with and sort
        String[] array = {"Lindsey", "Charlie", "Quentin", "Cynthia", "Bryan", "Ashley"};

        // call the sorting methods
        bubbleReverseSort(array);
        selectionReverseSort(array);
        mergeReverseSort(array);
        quickReverseSort(array);
        // print the count for all of the methods
        System.out.println("It conducted " + count + " comparisons.");
        // call the method to print the sorted array
        PrintArray(array);
    }
    public static long count; // storing the value for the comparisons

    // Method to sort the array in descending order
    public static void bubbleReverseSort(String[] array)
    {
        // Outer loop decrements the part of the array that is scanned each time
        for (int time = 0; time < array.length - 1; time++)
        {
            // Boolean variable to keep track if any swap was made during the pass
            boolean didSwap = false;
            // Inner loop compares each element with the next one and swaps if necessary
            for (int i = 0; i < array.length - 1 - time; i++)
            {
                if(array[i].compareTo(array[i+1]) < 0)
                {
                    String temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    didSwap = true;
                }
                count++;
            }
            // Breaks the loop early if no swap was made, as that means the array is already sorted
            if(!didSwap)
            {
                break;
            }
        }
    }

    // Method to sort the array in descending order
    public static void selectionReverseSort(String[] array)
    {


        //Traverse the array - 1
        for(int i = 0; i < array.length - 1; i++)
        {// anywhere position i is, thats the max so far
            int max = i;
            // compare i and j. if j is greater, replace it with i and move j forward and keep comparing
            for(int j = i + 1; j < array.length; j++)
            // keep track of the comparison for the swaps
            {   count++;
                if(array[j].compareTo(array[max]) > 0)
                {
                    max = j;
                }
            } // make a temp array to store the value and swap
            String temp = array[i];
            array[i] = array[max];
            array[max] = temp;
        }

    }

    // Method to sort the array in descending order
    public static void mergeReverseSort(String[] array)
    {
        if(array.length > 1)
        {
            int mid = array.length / 2;
            // Split the array into two halves
            String[] left = Arrays.copyOfRange(array, 0, mid);
            String[] right = Arrays.copyOfRange(array, mid, array.length);

            // Recursively sort the two halves
            mergeReverseSort(left);
            mergeReverseSort(right);
            // Merge the sorted halves back into the main array
            mergeHelper(array, left, right);
        }

    }

    // Helper method to merge two sorted arrays in reverse order
    public static void mergeHelper(String[] array, String[] left, String[] right)
    {
        int i = 0;
        int j = 0;
        int k = 0;
        // Merge the elements from left and right in descending order
        while (i < left.length && j < right.length) {
            count++;
            if (left[i].compareTo(right[j]) > 0) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }
        // Copy the remaining elements from left, if any
        while (i < left.length) {
            array[k] = left[i];
            i++;
            k++;
        }
        // Copy the remaining elements from right, if any
        while (j < right.length) {
            array[k] = right[j];
            j++;
            k++;
        }


    }
    // Method to sort the array in descending order
    public static void quickReverseSort(String[] array) {
        // Initial call to the helper method
        quickSortReverse(array, 0, array.length - 1);
    }


    // Helper method to sort a subsection of the array using quick sort
    private static void quickSortReverse(String[] array, int lowerIndex, int higherIndex) {
        if (lowerIndex < higherIndex) {
            int pivotIndex = partition(array, lowerIndex, higherIndex);
            quickSortReverse(array, lowerIndex, pivotIndex - 1);
            quickSortReverse(array, pivotIndex + 1, higherIndex);
        }
    }
    // Helper method to partition the array on the basis of pivot
    private static int partition(String[] array, int lowerIndex, int higherIndex) {
        String pivot = array[higherIndex];
        int i = lowerIndex - 1;
        // Place all elements greater than pivot before the pivot, and the ones lesser after
        for (int j = lowerIndex; j < higherIndex; j++) {
            count++;
            if (array[j].compareTo(pivot) > 0) {
                i++;
                swap(array, i, j);
            }
        }
        // Swap pivot with the element at i+1
        swap(array, i + 1, higherIndex);
        return i + 1;
    }
    // Helper method to swap two elements in the array
    private static void swap(String[] array, int i, int j) {
        String tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    // Method to print the array
    public static void PrintArray(String[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            System.out.println(array[i] + " ");
        }

    }
}




