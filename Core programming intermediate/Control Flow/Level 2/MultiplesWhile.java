import java.util.*;

class MultiplesWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n > 0 && n < 100) {
            int i = 1;

            while (i < 100) {
                if (i % n == 0)
                    System.out.println(i);
                i++;
            }
        } else {
            System.out.println("Enter number between 1 and 99");
        }

       
    }
}