// Quentin Peterich

public class HomeWork {
    public static void main(String[] args) {
        /// Problem 1. O(logn)




        /////////////////////// Problem 2/////////////////////////
        // to find the most efficient way to determine what floor is the maximum height you can drop an egg and not crack it//
        // You can set this up by doing a binary search between 1 and 100.
        // However, if you start at 50, and the egg breaks, you will only have 1 egg left to test your strategy with the next floor at 25
        // If you start at 10, it will give you the worst case of 19 drops.
        // The next approach would be balancing linear drops.
        // The linear portion of the strategy is x + (x - 1)
        // If the egg doesnt break on the first drop, the next drop should be from x-1 floors up.
        // which would be x(x + 1) / 2
        // since there are 100 floors, the equation would be x(x +1) / 2 = 100
        // x = 13.651
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10};
        // array to have numbers to search from
        boolean nonDuplicate = true;
        // to check if nonDuplicate is true or not
        System.out.println(nonDuplicate(arr));
        // output the number
    }
    ///////////////////////////Problem 3/////////////////////////////////
    public static int nonDuplicate(int[] array) {
        // start from the beginning of the array at 0 and traverse through the length of the array - 1
        int start = 0, end = array.length - 1;
        // while the start is less than the end
        while (start < end) {
            // find the mid by subtracting the end from the start
            int mid = start + (end - start) / 2;
            // if mid is odd, decrement it to make it even. so it always points to the first element of a pair
            if (mid % 2 == 1){
                mid--;
            }
            // if number at mid index is not equal to the next element,
            // then the single element is on the left half
            // update the end pointer to the mid
            if (array[mid] != array[mid + 1]){
                end = mid;
            }
            // else the single element is on the right half.
            // update the start pointer to mid + 2
            else {
                start = mid + 2;
            }
        }
        // once loop complete, start will be pointing to the single element
        return array[start];
    }
}
