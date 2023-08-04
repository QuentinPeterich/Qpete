//Quentin Peterich

import java.util.Scanner;

public class UserName {
    public static void main(String[] args) {
        // create a scanner and import java.until.Scanner
        Scanner newScanner = new Scanner(System.in);
        System.out.println("What is your name?");

        // reading the users input for their name
        String userInput = newScanner.nextLine();
        // Taking the users input and making it all uppercase
        System.out.println("Hello, " +  userInput.toUpperCase() + ", nice to meet you!");
    }
}
