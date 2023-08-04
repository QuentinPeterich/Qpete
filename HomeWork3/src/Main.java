public class Main {
    public static void main(String[] args) {
        // Create two variables of the TvParts enumerated type
        TvParts oledDisplay = TvParts.SCREEN;
        TvParts surroundSound = TvParts.SPEAKER;

        // Display the variables to the console
        System.out.println("Part 1: " + part1);
        System.out.println("Part 2: " + part2);

        // Create two instances of the TV class
        Tv tv1 = new Tv("Samsung", "ScreenSize", oledDisplay);
        Tv tv2 = new Tv("Brand2", "Model2", surroundSound);

        // Use the mutators to set all instance variables for the two instances
        tv1.setBrand("Samsung");
        tv1.setSize(85);
        tv1.setPart(TvParts.POWERSUPPLY);

        tv2.setBrand("Brand4");
        tv2.setSize(65);
        tv2.setPart(TvParts.VIDEOCARD);

        // Use the accessors to display the values of all fields of the two instances
        System.out.println("TV1 Brand: " + tv1.getBrand());
        System.out.println("TV1 Model: " + tv1.getSize());
        System.out.println("TV1 Part: " + tv1.getPart());

        System.out.println("TV2 Brand: " + tv2.getBrand());
        System.out.println("TV2 Model: " + tv2.getSize());
        System.out.println("TV2 Part: " + tv2.getPart());
    }
}
