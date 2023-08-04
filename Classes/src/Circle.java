public class Circle extends Shape {
    double radius;


    @Override
    public double getArea() {
        return pi * Math.pow(radius, 2);

    }

}

