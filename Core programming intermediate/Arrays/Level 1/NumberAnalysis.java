

import java.util.Scanner;

class NumberAnalysis {

    public static void main(String[] args) {

        // Creating Scanner object
        Scanner scanner = new Scanner(System.in);

        // Constant for array size
        int totalNumbers = 5;

        // Array declaration
        int[] numbers = new int[totalNumbers];

        // Taking input with validation
        for (int i = 0; i < numbers.length; i++) {

            System.out.print("Enter number " + (i + 1) + ": ");

            if (scanner.hasNextInt()) {
                numbers[i] = scanner.nextInt();
            } else {
                System.out.println("Error: Please enter a valid integer.");
                scanner.next(); 
                i--;
                continue;
            }
        }

        System.out.println("\n Number Analysis");

        for (int i = 0; i < numbers.length; i++) {

            int currentNumber = numbers[i];

    
            if (currentNumber > 0) {

                if (currentNumber % 2 == 0) {
                    System.out.println(currentNumber + " is positive and even.");
                } else {
                    System.out.println(currentNumber + " is positive and odd.");
                }

            }
       
            else if (currentNumber < 0) {
                System.out.println(currentNumber + " is negative.");
            }
   
            else {
                System.out.println(currentNumber + " is zero.");
            }
        }

       
        int firstElement = numbers[0];
        int lastElement = numbers[numbers.length - 1];

        System.out.println("\nComparison");

        if (firstElement == lastElement) {
            System.out.println("First and last elements are equal.");
        } else if (firstElement > lastElement) {
            System.out.println("First element is greater than last element.");
        } else {
            System.out.println("First element is less than last element.");
        }

    }
}