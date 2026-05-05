// Program Name: MatrixToArray
// Description: Converts a 2D array into a 1D array
// Author: Neelakshi

import java.util.Scanner;

class MatrixToArray {

    public static void main(String[] args) {

      
        Scanner sc = new Scanner(System.in);

     
        int rows, columns;

        // Input rows with validation
        System.out.print("Enter number of rows: ");
        if (sc.hasNextInt()) {
            rows = sc.nextInt();
            if (rows <= 0) {
                System.out.println("Error: Rows must be positive.");
                sc.close();
                return;
            }
        } else {
            System.out.println("Error: Invalid input.");
            sc.close();
            return;
        }

        
        System.out.print("Enter number of columns: ");
        if (sc.hasNextInt()) {
            columns = sc.nextInt();
            if (columns <= 0) {
                System.out.println("Error: Columns must be positive.");
                sc.close();
                return;
            }
        } else {
            System.out.println("Error: Invalid input.");
            sc.close();
            return;
        }

       
        int[][] matrix = new int[rows][columns];

  
        System.out.println("Enter matrix elements:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (sc.hasNextInt()) {
                    matrix[i][j] = sc.nextInt();
                } else {
                    System.out.println("Error: Invalid input.");
                    sc.close();
                    return;
                }
            }
        }

        
        int[] array = new int[rows * columns];

        int index = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                array[index] = matrix[i][j];
                index++;
            }
        }

        System.out.println("\nConverted 1D Array:");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

       
    }
}