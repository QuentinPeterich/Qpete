// Quentin Peterich

public class Main {
    public static void main(String[] args) {

        // make the first die choose a random number up to 20
        int die1 = (int)(Math.random() * 20) + 1;
        System.out.println("The first die comes up to " + die1);

        // make the second die choose a random number up to 20
        int die2 = (int)(Math.random() * 20) + 1;
        System.out.println("The second die comes up to " + die2);

        // add die1 and die2 to get the total count of the rolls
        int solution = die1 + die2;
        System.out.println("Your total roll is " + solution);


    }

    }

