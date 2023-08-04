public class Computer {
    private double weight;




    public double getWeight(){
        return this.weight;
    }
    // has to be inside of a method to be used
//    Circle newCircle = new Circle();
//    newCircle.height = 10;
//    System.out.println(newCircle);
    public void Circle(double height){
        Circle newCircle = new Circle();
        newCircle.height = height;
        System.out.println(newCircle);
    }

    public void setWeight(double weight) throws Exception {
        if (weight > 999){
            throw new Exception("Weight cannot be over 999");
        } else if (weight < 0) {
            throw new Exception("Weight cannot be below 0");
        } else {
            this.weight = weight;
        }

        Circle newCircle = new Circle();
        newCircle.height = 10;
        System.out.println(newCircle);

    }




}
