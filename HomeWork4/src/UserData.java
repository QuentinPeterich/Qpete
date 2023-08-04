// Quentin Peterich
public class UserData {
    // Private fields: age and maximumHeartRate
    private int age;
    private double maximumHeartRate;

    // Default constructor
    // Initializes age to 25 and maximumHeartRate to 220 - age
    public UserData() {
        this.age = 25;
        this.maximumHeartRate = 220 - age;
    }

    // Non-default constructor
    // Initializes age with a provided value and calculates the maximumHeartRate
    public UserData(int age) {
        this.age = age;
        this.maximumHeartRate = 220 - age;
    }

    // Getter and Setter methods for age and maximumHeartRate
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMaximumHeartRate() {
        return maximumHeartRate;
    }

    public void setMaximumHeartRate(double maximumHeartRate) {
        this.maximumHeartRate = maximumHeartRate;
    }

    // Method that returns a calculated value, in this case the maximum heart rate for age
    public double calculateMaxHeartRateForAge() {
        return maximumHeartRate;
    }

    // Void method that displays the user's data
    public void displayUserData() {
        System.out.println("Age: " + age);
        System.out.println("Maximum Heart Rate: " + maximumHeartRate);
    }
}