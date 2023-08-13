public class Main {
    public static void main(String[] args) {
        System.out.println("Let's test is Prime");
        boolean result = IsPrime(2029);
        System.out.println(result);

    }


    public static boolean IsPrime(int number)
    {
        if(number < 2)
        {
            return false;
        }
        //check if the number has any proper divisor
        for(int i = 2; i <= Math.sqrt(number); i++)
        {
            //check if i divides number
            if(number % i == 0)
            {
                // i divides number
                return false; // so number i not prime
            }
        }
        return true;
    }



}