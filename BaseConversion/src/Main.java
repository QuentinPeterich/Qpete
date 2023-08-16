public class Main {
    public static void main(String[] args) {
        System.out.println(ConvertFromBase10(2023, 16));
        System.out.println(ConvertToBase10("27148", 10));

    }

    public static String ConvertFromBase10(int number, int newBase)
    {
        String answer = ""; // the result will be added here
       while(number > 0) {
           int digit = number % newBase; // get the mod
           if(digit < 10) {
               answer = digit + answer; // add the digit to the left side
           } else // 10=A, 11=B, 12=C ....
           {
               answer = (char)(digit - 10 + 'A') + answer;
           }
           number = number / newBase;
       }
       return answer;
    }

    public static int ConvertToBase10(String number, int oldBase)
    {
        int answer = 0;
        // traverse number
        for(char c : number.toCharArray())
        {
            answer *= oldBase;
            if(c >= '0' && c <= '9')
            {
                answer += c - '0';
            } else // if c = 'A' then use 10, '0' -> 11, 'C' -> 12
            {
                answer += c - 'A' + 10;
            }
        }
        return answer;
    }



}