public class Main {
    public static void main(String[] args) {
        int age = 20;
        MilitaryBranches myBranch = MilitaryBranches.ARMY;
//        System.out.println(myBranch);

        Car myCar = new Car(); // myCar is a car reference, new Car() is an object
        Student s1 = new Student();
//        s1.name = "Quentin Peterich";
        s1.setName("Quentin Peterich");
//        System.out.println(s1.getName());
        s1.setGPA(3.8);
        s1.setMajor(Majors.CLOUDCOMPUTING);


        Die die = new Die();
        die.color = Colors.BLUE;
        die.roll();
//        System.out.println("The Blue die shows: " + die.getFace());
//        die.numberOfSides = 20;
//        die.face = 4;

        Die die2 = new Die();
        die2.color = Colors.RED;
        die2.roll();

        die.displayInfo();
        die2.displayInfo();

    }
}



