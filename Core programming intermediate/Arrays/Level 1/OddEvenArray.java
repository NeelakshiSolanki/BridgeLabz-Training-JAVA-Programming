// Program Name: OddEvenArray
// Description: Stores odd and even numbers separately
// Author: Neelakshi

import java.util.Scanner;

class OddEvenArray {

    public static void main(String[] args) {

        // Scanner object
        Scanner scanner = new Scanner(System.in);

        // Variables
        int number;

        // Input with validation
        System.out.print("Enter a natural number: ");

        if (scanner.hasNextInt()) {
            number = scanner.nextInt();

            // Check natural number
            if (number <= 0) {
                System.out.println("Error: Please enter a natural number.");
                scanner.close();
                return;
            }

        } else {
            System.out.println("Error: Invalid input.");
            scanner.close();
            return;
        }

        // Array size calculation
        int size = number / 2 + 1;

        int[] oddNumbers = new int[size];
        int[] evenNumbers = new int[size];

        int oddIndex = 0;
        int evenIndex = 0;

        // Loop from 1 to number
        for (int i = 1; i <= number; i++) {

            if (i % 2 == 0) {
                evenNumbers[evenIndex] = i;
                evenIndex++;
            } else {
                oddNumbers[oddIndex] = i;
                oddIndex++;
            }
        }

        System.out.println("\nOdd Numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }

        
        System.out.println("\nEven Numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }

      
    }
}