// Program Name: MultiplicationTable
// Description: This program prints multiplication table of a number using an array
// Author: Neelakshi

import java.util.Scanner;

class MultiplicationTable {

    public static void main(String[] args) {

        
        Scanner scanner = new Scanner(System.in);

        int number;                 
        int tableSize = 10;         
        int[] tableResults = new int[tableSize]; 

        
        System.out.print("Enter a number: ");

        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
        } else {
            System.out.println("Error: Please enter a valid integer.");
            scanner.close();
            return;
        }

        
        for (int i = 1; i <= tableResults.length; i++) {

           
            tableResults[i - 1] = number * i;
        }

        System.out.println("\n--- Multiplication Table ---");

      
        for (int i = 1; i <= tableResults.length; i++) {

            System.out.println(number + " * " + i + " = " + tableResults[i - 1]);
        }

       
    }
}