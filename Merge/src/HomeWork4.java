public class HomeWork4 {

    public static void BubbleReverseSort(String[] arr)
    {
        long count = 0;
        for(int time = 0; time < array.length -1; time++)
        {
            boolean didSwap = false;

            for(int i = 0; i < array.length -1 - time; i++)
            {
                count++;

                if(array[i].compareTo(array[i+1]) <0) {
                    String tmp = array[i];
                    array[i] = array[i+1];
                    array[i+1] tmp;
                    didSwap = true;
                }
            }

            if(!didSwap) {
                break;
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
