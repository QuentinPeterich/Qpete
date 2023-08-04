enum Colors {RED, WHITE, BLUE, BLACK, GREEN}

public class Die {
    private int numberOfSides = 6;
    Colors color;
    private int face;

    //actions/behavior - setters, getters, methods
    public int getFace()
    {
        return face;
    }
    //Roll
    //Changes the value of face to random number in {1,2,3,4.....numberOfSides}
    public void roll()
    {
        // Math.random() (0,1)
        // Math.random() * 6 (0,6)
        // (int) (Math.random() * 6 (0,5)
        face = (int)(Math.random() * numberOfSides) + 1;
    }
    //DisplayDetails

    public void displayInfo()
    {
        System.out.println("=======================================");
        System.out.println("The die has " + numberOfSides + " sides");
        System.out.println("The die color is " + color);
        System.out.println("The face shows: " + face);
        System.out.println("=======================================");
    }

}
