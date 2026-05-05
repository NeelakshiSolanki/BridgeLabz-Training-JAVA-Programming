// Program Name: MeanHeightCalculator
// Description: Calculates mean height of football players
// Author: Neelakshi

import java.util.Scanner;

class MeanHeightCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        int totalPlayers = 11;
        double[] heights = new double[totalPlayers];
        double sum = 0.0;

        // Input with validation
        for (int i = 0; i < heights.length; i++) {

            System.out.print("Enter height of player " + (i + 1) + ": ");

            if (sc.hasNextDouble()) {
                heights[i] = sc.nextDouble();
            } else {
                System.out.println("Error: Invalid input.");
                sc.next();
                i--;
                continue;
            }
        }

        for (int i = 0; i < heights.length; i++) {
            sum = sum + heights[i];
        }

        
        double meanHeight = sum / heights.length;

        System.out.println("\nMean height of players = " + meanHeight);

       
    }
}