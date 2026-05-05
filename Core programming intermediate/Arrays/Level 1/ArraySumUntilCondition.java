
import java.util.Scanner;

class ArraySumUntilCondition {

    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);

    
        int maxSize = 10;            
        double[] numbers = new double[maxSize]; 
        double total = 0.0;              
        int index = 0;                   

        
        while (true) {

            System.out.print("Enter a number (0 or negative to stop): ");

           
            if (!sc.hasNextDouble()) {
                System.out.println("Error: Please enter a valid number.");
                sc.next(); 
                continue;
            }

            double inputNumber = sc.nextDouble();

            
            if (inputNumber <= 0) {
                break;
            }

            if (index >= numbers.length) {
                System.out.println("Array limit reached.");
                break;
            }

            
            numbers[index] = inputNumber;
            index++; 
        }

        System.out.println("\n--- Entered Numbers ---");

        
        for (int i = 0; i < index; i++) {

            System.out.println(numbers[i]);
            total = total + numbers[i];
        }

      
        System.out.println("\nTotal sum = " + total);

       
    }
} 
    

