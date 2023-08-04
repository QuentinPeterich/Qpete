public class index {
    public static void main(String[] args) {
        boolean isAlien = false;
        if(isAlien == false){
            System.out.println("It is not an alien!");
            System.out.println("And i am scared of aliens");
        }

        int topScore = 80;
        if(topScore >= 100)
        {
            System.out.println("You got the high score!");
        }


        int secondTopScore = 95;
        if((topScore > secondTopScore) && (topScore < 100))
        {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90))
        {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if(newValue == 50)
        {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if(isCar) // if you just put the isCar, you are really saying if(isCar == true)
        {
            System.out.println("This is not supposed to happen");
        }

        // Ternary operator operand1 ? operand2 : operand3
        String makeOfCar = "Ford";
        // first operand is the conditioneal youre testing
        // second operand is the value that will get assigned if the statement is true
        // third operand is the value that gets assigned if the expression is false

        boolean isDomestic = makeOfCar == "Ford" ? false : true;

        if (isDomestic)
        {
            System.out.println("This car is domestic to our country");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);

        double num = 20.00;
        double num2 = 80.00;
        double total = (num + num2) * 100;
        double totalLeft = total % 40;
        System.out.println("MyValuesTotal " + total);

        boolean isTotal = (totalLeft == 0.00) ? true : false;
        System.out.println(isTotal);

        if(!isTotal)
        {
            System.out.println("Got some remainder");
        }




    }

}


