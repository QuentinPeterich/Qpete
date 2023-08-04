enum Make {FORD, TESLA, JEEP, KIA, VOLKSWAGEN, TOYOTA}

public class Car {
    Make make;
    double mileage = 0; // default is miles
    static int count; // With static, all instance will share this

    public Car(Make make){
        this.make = make;
        count++;
    }
    public Car(Make make, double mileage){
        this.make = make;
        this.mileage = mileage;
        count++;
    }

    public void  Drive(double miles) throws Exception{
        if (miles < 0) {
            throw new Exception("You cannot drive negative miles");
        }
        if (miles == 0) {
            throw new InstantiationException("You cannot drive 0 miles");
        }
        // every time we drive, increase the miles
        mileage += miles;
    }
    public void Honk(){
        System.out.println("Horn is honked Beep Beep");
    }

    public void Honk(String sound){
        System.out.println("Horn is honked" + sound);
    }

    @Override
    public String toString(){
        return "\nMake: " + make + "\nMiles: " + mileage + "\nCount " + count;

    }

    static public double ConvertMilesToKm(double miles) {
        return miles * 1.60934;
    }


}
