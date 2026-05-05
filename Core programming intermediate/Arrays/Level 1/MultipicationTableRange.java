

import java.util.Scanner;

class MultiplicationTableRange {

    public static void main(String[] args) {

       
        Scanner sc = new Scanner(System.in);

       
        int number;
        int start = 6;
        int end = 9;
        int size = end - start + 1;

        int[] multiplicationResult = new int[size];

        System.out.print("Enter a number: ");

        if (sc.hasNextInt()) {
            number = sc.nextInt();
        } else {
            System.out.println("Error: Invalid input.");
            sc.close();
            return;
        }

       
        int index = 0;
        for (int i = start; i <= end; i++) {
            multiplicationResult[index] = number * i;
            index++;
        }

       
        System.out.println("\n Multiplication Table (6 to 9) ");

        index = 0;
        for (int i = start; i <= end; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[index]);
            index++;
        }

    }
}