

public class Pens {
    public static void main(String[] args){
        int TotalPens = 14;
        int Pen = 0;
        int Student =  3;
        int find = 0;
        int PenMod =0;
        PenMod = TotalPens % Student;
        find = TotalPens / Student;
        System.out.println("The Pen Per Student is" + find + "and the remaining pen not distributed is" + PenMod);


    }
}
