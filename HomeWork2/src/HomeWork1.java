//Quentin Peterich

public class HomeWork1 {
    public static void main(String[] args) {

        // array built where numbers repeat except one
        int[] arr = {2, 3, 5, 4, 5, 3, 4, 2, 7};
        // print out the single number that doesnt repeat itself
        System.out.println(singleNum(arr));
    }

    static int singleNum(int[] array) {
       // setting the result to 0 to give it somewhere to store
        int result = 0;
        // Get the number of elements in the array by the length
        int n = array.length;
        // Loop through each element
        for(int i = 0; i < n; i++) {
            // perform X0R operation with each element.
            // assign it back to the result
            // X0R operation will cancel out elements that appear twice.
            result ^= array[i];
        }
        // return the result of which element does not appear twice
        return result;
    }
}
