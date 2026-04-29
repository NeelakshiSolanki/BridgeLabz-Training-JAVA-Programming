public class Course {
    public static void main(String[] args) {

        int fee = 125000;
        int discountPercent = 10;

        double discount = (fee * discountPercent) / 100.0;
        double finalFee = fee - discount;

        System.out.println("Original Fee: INR " + fee);
        System.out.println("Discount: INR " + discount);
        System.out.println("Final Fee to Pay: INR " + finalFee);
    }
}