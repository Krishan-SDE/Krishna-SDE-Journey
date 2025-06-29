import java.util.*;

public class function1 {

    // Function to calculate factorial of a number
    public static void factorial(int j) {
        int n = 1; // This will hold the final factorial result

        // Check if input is 0 or negative
        if (j == 0 || j < 0) {
            System.out.println("Invalid Number: Factorial is not defined for 0 or negative numbers.");
        } else {
            // Multiply numbers from j to 1 (e.g., 5 * 4 * 3 * 2 * 1)
            for (int i = j; i >= 1; i--) {
                n = n * i; // Accumulate the result
            }

            // Print the result after loop ends
            System.out.println("The factorial of " + j + " is: " + n);
        }
    }

    // Main function: program starts here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // To take user input

        // Prompt the user to enter a number
        System.out.print("Enter a number to calculate its factorial: ");
        int k = sc.nextInt(); // Read the input number

        // Call the factorial function with user input
        factorial(k);
    }
}
