//Quentin Peterich
import java.util.Scanner;

public class ChangeCounter {
    public static void main(String[] args) {
        // Getting the users input for how much change
        Scanner myScanner = new Scanner(System.in);

        // let the user enter all of their quarters, dimes, nickels and pennies separately before doing anything.
        // myScanner.nextInt() will allow this to happen

        // get the user input and assign it to quarters
        System.out.println("How many quarters do you have?");
        int quarters = myScanner.nextInt();

        // get the user input and assign it to dimes
        System.out.println("How many dimes do you have?");
        int dimes = myScanner.nextInt();

        // get the user input and assign it to nickels
        System.out.println("How many nickels do you have?");
        int nickels = myScanner.nextInt();

        // get the user input and assign it to pennies
        System.out.println("How many pennies do you have?");
        int pennies = myScanner.nextInt();


        // calculate all the users inputs for quarters, dimes, nickels and pennies
        // assign the input to the correct value by multiplying it.
        double total = quarters * 0.25 + dimes * 0.10 + nickels * 0.05 + pennies * 0.01;

        // print the total out as a string and only allow 2 digits to be displayed after the decimal point
        System.out.println("You have $" + String.format("%.2f", total));



    }
}
