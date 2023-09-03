package academy.beyondeducation.java.types;

import academy.beyondeducation.java.classes.data.Company;
import academy.beyondeducation.java.classes.service.InadequateProfitService;
import academy.beyondeducation.java.classes.service.ProfitService;

public class ReferenceVsValueTypes {
    public static void main(String[] args) {
        Company company = new Company("Some boring name", "", 6, 1_000);
        // Passing method arguments as reference (Company class - pointer)
        System.out.println("Reference Type ---");
        ProfitService profitService = new ProfitService();
        System.out.println(company);
        profitService.increase(1_000, company);
        System.out.println(company);
        // Passing method arguments as value (int primitive class - copy)
        System.out.println("Value Type ---");
        InadequateProfitService inadequateProfitService = new InadequateProfitService();
        double profit = company.getProfit();
        System.out.println("Profit: " + profit);
        inadequateProfitService.increase(1_000, profit);
        System.out.println("Profit: " + profit);
    }
}
