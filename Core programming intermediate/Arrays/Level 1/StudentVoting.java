// Program Name: StudentVotingEligibility
// Description: This program checks whether students can vote based on age
// Author: Neelakshi

import java.util.Scanner;

class StudentVoting {

    public static void main(String[] args) {

      
        Scanner scanner = new Scanner(System.in);

        int totalStudents = 10;

        
        int[] studentAges = new int[totalStudents];

        for (int i = 0; i < studentAges.length; i++) {

            System.out.print("Enter age of student " + (i + 1) + ": ");

            
            if (scanner.hasNextInt()) {
                studentAges[i] = scanner.nextInt();
            } else {
                System.out.println("Error: Invalid input. Please enter an integer.");
                scanner.next(); 
                i--;
                continue;
            }
        }

        System.out.println("\nVoting Eligibility");

       
        for (int i = 0; i < studentAges.length; i++) {

            int age = studentAges[i];

     
            if (age < 0) {
                System.out.println("Invalid age: " + age);
            }

            else if (age >= 18) {
                System.out.println("Student with age " + age + " can vote.");
            }
            
            else {
                System.out.println("Student with age " + age + " cannot vote.");
            }
        }

        
    }
}