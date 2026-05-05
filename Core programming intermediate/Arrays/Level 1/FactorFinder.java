

import java.util.Scanner;

class FactorFinder {

    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);

        
        int number;             
        int maxFactor = 10;      
        int[] factors = new int[maxFactor]; 
        int index = 0;          

        System.out.print("Enter a positive integer: ");

        if (sc.hasNextInt()) {
            number = sc.nextInt();

            if (number <= 0) {
                System.out.println("Error: Please enter a positive number.");
                sc.close();
                return;
            }

        } else {
            System.out.println("Error: Invalid input.");
            sc.close();
            return;
        }

      
        for (int i = 1; i <= number; i++) {

    
            if (number % i == 0) {

               
                if (index == maxFactor) {

                    
                    maxFactor = maxFactor * 2;

                  
                    int[] temp = new int[maxFactor];

                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }

               
                    factors = temp;
                }

             
                factors[index] = i;
                index++;
            }
        }

        System.out.println("\nFactors of " + number + " are:");

        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

        
    }
}