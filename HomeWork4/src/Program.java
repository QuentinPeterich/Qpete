// Quentin Peterich
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        // Scanner object to collect user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for their age, resting heart rate, and target heart rate percentage
        System.out.println("Enter your age:");
        int age = scanner.nextInt();

        System.out.println("Enter your resting heart rate:");
        int restingHeartRate = scanner.nextInt();

        System.out.println("Enter your target heart rate percentage (e.g., 0.7 for 70%):");
        double targetPercentage = scanner.nextDouble();

        // an instance of UserData using the non-default constructor and display the user's data
        UserData userData = new UserData(age);
        userData.displayUserData();

        // Create an instance of FitByte using the non-default constructor and display the target heart rate
        FitByte fitByte = new FitByte(age, restingHeartRate, targetPercentage);
        fitByte.displayTargetHeartRate();

        // Close the scanner
        scanner.close();
    }
}