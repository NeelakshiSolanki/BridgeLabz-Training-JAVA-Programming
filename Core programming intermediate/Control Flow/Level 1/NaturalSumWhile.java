import java.util.*;

class NaturalSumWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n > 0) {
            int sumWhile = 0;
            int i = 1;

            while (i <= n) {
                sumWhile += i;
                i++;
            }

            int sumFormula = (n * (n + 1)) / 2;

            System.out.println("While Sum = " + sumWhile);
            System.out.println("Formula Sum = " + sumFormula);

            if (sumWhile == sumFormula)
                System.out.println("Both results are correct");
        } else {
            System.out.println("Not a natural number");
        }

        
    }
}