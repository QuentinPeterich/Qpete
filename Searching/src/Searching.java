public class Searching {
    public static void main(String[] args) {
        double[] numbers = {10, 20, 51, 70, 80, 511, 2800, 10000}; // array of double values
        double target = 700;
//        System.out.println(LinearSearch(numbers, target) );
        System.out.println(BinarySearch(numbers, target));
    }


    // Returns the index (so an int) of target inside array, -1 if not found
    static int LinearSearch(double[] array, double target) // running time: O(n), where n = length of the array
    { // traverse the array
        for(int pos = 0; pos < array.length; pos++)
        {
            // check if the value in the array at position pos matches target
            if(array[pos] == target)
            {
                // we found target at position pos
                return pos;
            }
        }

        return -1;
    }
    //only get here if target is not found

    static int BinarySearch(double[] array, double target) // running time: O(log n)
    {
        int start = 0; // the current slice of the array is thr whole array
        int end = array.length-1;

        while(start <= end) // as long as the slice has at least one element, then we will keep searching through it
        {
            int mid = (start + end) / 2;
            if(array[mid] == target)
            {
                return mid; // success, we found target at position mid
            }
            else if(array[mid] > target) // mid is too high
            {
                end = mid - 1;
            }
            else // if array[mid] < target
            {
                start = mid + 1;
            }
        }
        // no luck, in finding target
        return -1;
    }

}
