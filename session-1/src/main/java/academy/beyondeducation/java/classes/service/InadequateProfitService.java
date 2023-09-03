package academy.beyondeducation.java.classes.service;

public class InadequateProfitService {
    public void increase(double amount, double profit) {
        // int is provided as a value type, so it doesn't update the original outside this method
        profit = amount + profit;
    }
}
