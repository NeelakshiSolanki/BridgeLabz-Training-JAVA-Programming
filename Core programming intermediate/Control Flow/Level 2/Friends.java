import java.util.*;

class Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter age of Amar: ");
        int ageA = sc.nextInt();

        System.out.print("Enter age of Akbar: ");
        int ageB = sc.nextInt();

        System.out.print("Enter age of Anthony: ");
        int ageC = sc.nextInt();

        
        System.out.print("Enter height of Amar: ");
        double hA = sc.nextDouble();

        System.out.print("Enter height of Akbar: ");
        double hB = sc.nextDouble();

        System.out.print("Enter height of Anthony: ");
        double hC = sc.nextDouble();


        String youngest;
        if (ageA < ageB && ageA < ageC)
            youngest = "Amar";
        else if (ageB < ageA && ageB < ageC)
            youngest = "Akbar";
        else
            youngest = "Anthony";


        String tallest;
        if (hA > hB && hA > hC)
            tallest = "Amar";
        else if (hB > hA && hB > hC)
            tallest = "Akbar";
        else
            tallest = "Anthony";

        System.out.println("Youngest friend: " + youngest);
        System.out.println("Tallest friend: " + tallest);

      
    }
}