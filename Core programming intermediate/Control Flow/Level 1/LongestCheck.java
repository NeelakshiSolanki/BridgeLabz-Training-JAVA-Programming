import java.util.*;

class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        boolean result = (num % 5 == 0);

        System.out.println("Is the number " + num + " divisible by 5? " + result);

      
    }
}