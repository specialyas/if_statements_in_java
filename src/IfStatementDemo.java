import java.util.Scanner; // Import the Scanner class for user input

public class IfStatementDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); // Read user input

        // Using if, else if, and else statements to check the number
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        scanner.close(); // Close the scanner
    }
}
