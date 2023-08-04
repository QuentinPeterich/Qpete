// Quentin Peterich

public class FitByte extends UserData {
    // Private fields: restingHeartRate and targetHeartRatePercentage
    private int restingHeartRate;
    private double targetHeartRatePercentage;

    // Default constructor
    // Initializes age and maximumHeartRate through the UserData constructor,
    // restingHeartRate to 70, and targetHeartRatePercentage to 0.6
    public FitByte() {
        super();
        this.restingHeartRate = 70;
        this.targetHeartRatePercentage = 0.6;
    }

    // Non-default constructor
    // Initializes age, maximumHeartRate, restingHeartRate, and targetHeartRatePercentage with provided values
    public FitByte(int age, int restingHeartRate, double targetHeartRatePercentage) {
        super(age);
        this.restingHeartRate = restingHeartRate;
        this.targetHeartRatePercentage = targetHeartRatePercentage;
    }

    // Getter and Setter methods for restingHeartRate and targetHeartRatePercentage
    public int getRestingHeartRate() {
        return restingHeartRate;
    }

    public void setRestingHeartRate(int restingHeartRate) {
        this.restingHeartRate = restingHeartRate;
    }

    public double getTargetHeartRatePercentage() {
        return targetHeartRatePercentage;
    }

    public void setTargetHeartRatePercentage(double targetHeartRatePercentage) {
        this.targetHeartRatePercentage = targetHeartRatePercentage;
    }

    // Method that returns a calculated value, in this case the target heart rate
    public double TargetHeartRate() {
        return ((getMaximumHeartRate() - restingHeartRate) * targetHeartRatePercentage) + restingHeartRate;
    }

    // Void method that displays the user's target heart rate
    public void displayTargetHeartRate() {
        System.out.println("Target Heart Rate: " + Math.round(TargetHeartRate()));
    }
}



