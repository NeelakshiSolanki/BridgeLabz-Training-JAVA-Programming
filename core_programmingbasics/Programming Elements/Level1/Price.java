

public class Price {
    public static void main(String[] agrs){
        int CostPrice = 129;
        int SellingPrice = 191;
        int Profit = 0;
        int ProfitPrecent = 0;
        Profit = SellingPrice - CostPrice;
        ProfitPrecent = (Profit *100 ) /CostPrice;
        System.out.println("The Cost Price is INR :" + CostPrice + "and Selling Price is INR :" + SellingPrice +
                            "\nThe Profit is INR:" + Profit + "and the Profit Percentage is :" + ProfitPrecent
        );

    }
}
