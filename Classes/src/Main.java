public class Main {
    public static void main(String[] args) {
        Fruit myFruit = new Fruit(Fruits.BANANA, true);
//        myFruit.type = Fruits.BANANA;
//        myFruit.isOrganic = true;
        // always set the type

        Fruit appleFruit = new Fruit(Fruits.APPLE);


        System.out.println(myFruit.type);

        Car car = new Car(Make.FORD);
        Car secondCar = new Car(Make.TOYOTA, 1000);
        System.out.println("Car: " + car);
        System.out.println("Second Car: " + secondCar);
        car.Honk();
        car.Honk(" Honk Honk");
        System.out.println(Car.count);
        double milesToKm = Car.ConvertMilesToKm(400.87);
        System.out.printf("%.2f",milesToKm);

        try {
            car.Drive(-14);
        } catch(InstantiationException e){
            System.out.println("Instantiation Exception" + e );

        } catch (Exception e){
            System.out.println("Regular Exception" + e);
            // handle exception
        } finally {
            System.out.println("Try catch has completed");
        }




    }

}
