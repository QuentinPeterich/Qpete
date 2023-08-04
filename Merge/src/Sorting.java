
public class Sorting {

    public static void main(String[] args) {
//        double[] numbers = {22, 11, 110, 6, 17, 10, 18, 22, 22, 22, 11}; //O(1 or n)
//        QuickSort(numbers);
//        String[] array = {"Hello", "World", "From", "GPT-4", "AI"};
//        bubbleReverseSort(Numbers);
////        MergeSort(numbers);
////        BubbleSort3(numbers); //sorts the array using Bubble Sort - O(n^2)
//        PrintArray(numbers); //display the sorted array- O(n)

        final int SIZE = 50_000;

        // Create 4 arrays for sorting
        double[] arr1 = new double[SIZE]; // allocate memory for the array
        double[] arr2 = new double[SIZE];
        double[] arr3 = new double[SIZE];
        double[] arr4 = new double[SIZE];

        // populate the arrays with random numbers
//        for(int i = 0; i < SIZE; i++)
//        {
//            arr1[i]=arr2[i]=arr3[i]=arr4[i] = Math.random() * SIZE;
//        }
        // Populate with sorted arrays
        for(int i = 0; i < SIZE; i++)
        {
            arr1[i]=arr2[i]=arr3[i]=arr4[i] = i;
        }

        // with reversely sorted arrays
        for(int i = 0; i < SIZE; i++)
        {
            arr1[i]=arr2[i]=arr3[i]=arr4[i] = SIZE - i;
        }


        // Call each sorting method and measure its running time in milliseconds
        long startTime = System.currentTimeMillis();
        BubbleSort3(arr1);
        long endTime = System.currentTimeMillis();
        System.out.println("BubbleSort3 took " + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        SelectionSort(arr2);
        endTime = System.currentTimeMillis();
        System.out.println("SelectionSort took " + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        MergeSort(arr3);
        endTime = System.currentTimeMillis();
        System.out.println("MergSort took " + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
//        QuickSort(arr4);
        endTime = System.currentTimeMillis();
        System.out.println("QuickSort took " + (endTime - startTime) + "ms");

    }

    public static void QuickSort(double[] arr)
    {
        QuickSortHelper(arr, 0, arr.length-1);
    }

    public static void QuickSortHelper(double[] arr, int startIdx, int endIdx)
    {
        if(startIdx < endIdx)
        {
            int p = Partition(arr, startIdx, endIdx);// partition, returns the new index for the pivot element
            QuickSortHelper(arr, startIdx, p - 1); // sort the first "half" || could be empty!!
            QuickSortHelper(arr, p + 1, endIdx); // sort the second "half" || could be empty!!
        }
    }

    public static int Partition(double[] arr, int startIdx, int endIdx)
    {
        double pivot = arr[endIdx];
        int i = startIdx - 1;

        //traverse slice
        for(int j = startIdx; j < endIdx; j++)
        {
            if(arr[j] <= pivot)
            {
                i++; // move i over by one
                // swap elements at position i and j
                double tmp = arr[j];
                arr[j] = arr[i];
                arr[i] = tmp;
            }
        }
        i++;
        // swap elements in position i with pivot (index endIdx)
        arr[endIdx] = arr[i];
        arr[i] = pivot;
        return i; // new position for pivot
    }



    public static void MergeSort(double[] arr)
    {
        double[] tmp = new double[arr.length];
        MergeSortHelper(arr, 0, arr.length-1,tmp);
    }

    public static void MergeSortHelper(double[] arr, int startIdx, int endIdx, double[] tmp)
    {
        if(startIdx < endIdx) // Continue dividing as long as you have at least 2 elements in the slice
        {
            int midIdx = (startIdx + endIdx) / 2;  // find the middle
            MergeSortHelper(arr, startIdx, midIdx, tmp); // sort the first half of the slice
            MergeSortHelper(arr, midIdx + 1, endIdx, tmp); // sort the second half of the slice
            Merge(arr, startIdx, midIdx, endIdx, tmp); // Merge the two sorted half slices
        }

    }

    public static void Merge(double[] arr, int startIdx, int midIdx, int endIdx, double[] tmp)
    {
        int i = startIdx;
        int k = i;
        int j = midIdx + 1;

        while(i <= midIdx && j <= endIdx)
        {
            if(arr[i] < arr[j])
            {
                tmp[k] = arr[i];
                i++;
                k++;

            } else
            {
                tmp[k] = arr[j];
                j++;
                k++;
            }
        }

        // one slice and been depleted.... copy down the remaining elements
        while(i <= midIdx)
        {
            tmp[k] = arr[i];
            i++;
            k++;
        }
        while(j <= endIdx)
        {
            tmp[k] = arr[j];
            j++;
            k++;
        }

        // copy elements from tmp into arr
        for(k = startIdx; k <= endIdx; k++)
        {
            arr[k] = tmp[k];
        }

    }
















    public static void SelectionSort(double[] array)
    {
        for(int j=0; j<array.length-1; j++)//j is the starting position for each run
        {
            int min_pos = j;//keeps track of the position for the smallest value
            //find the position of smallest value in the array
            for(int i = j+1; i<array.length;i++)
            {
                if(array[i] < array[min_pos])//if we find something smaller
                {
                    //save its position
                    min_pos = i;
                }
            }
            //swap elements at position j and min_pos
            double tmp= array[j];
            array[j] = array[min_pos];
            array[min_pos] = tmp;
        }
    }
    public static void BubbleSort(double[] array)
    {
        for(int time = 0; time <array.length-1; time++)
        {
            //traverse the array
            for(int i=0; i<array.length - 1;i++)
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


    public static void BubbleSort2(double[] array)
    {
        for(int time = 0; time <array.length-1; time++)
        {
            //traverse the array
            for(int i=0; i<array.length - 1 - time;i++)
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

    public static void BubbleSort3(double[] array)//running time: O(n^2), best case is O(n)/big omega(n)
    {
        for(int time = 0; time < array.length - 1; time++)
        {
            boolean didSwap = false;
            //traverse the array
            for(int i=0; i<array.length - 1 - time;i++)
            {
                if(array[i] > array[i+1])
                {
                    //swap the elements at position i and i+1
                    double tmp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = tmp;
                    didSwap = true; //set the flag, we swapped values
                }
            }
            //did we do any swaps?
            if(!didSwap) //no swaps done in one run = array is now sorted
            {
                break; //leave the loop, we are done
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









     String[] array = {"Hello", "World", "From", "GPT-4", "AI"};

        System.out.println("Before Sorting:");
        for(String str: array){
        System.out.print(str + " ");
    }
        System.out.println();

    BubbleReverseSort(array);

        System.out.println("After Sorting:");
        for(String str: array){
        System.out.print(str + " ");
    }
        System.out.println();


    static void BubbleReverseSort(String[] array) {
        long count = 0;

        for(int time = 0; time < array.length - 1; time++) {
            boolean didSwap = false;

            for(int i=0; i<array.length - 1 - time;i++) {
                count++;

                if(array[i].compareTo(array[i+1]) < 0) {
                    String tmp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = tmp;
                    didSwap = true;
                }
            }

            if(!didSwap) {
                break;
            }
        }

        System.out.println("Number of comparisons: " + count);
    }







}