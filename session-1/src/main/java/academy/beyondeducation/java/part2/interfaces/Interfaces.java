package academy.beyondeducation.java.part2.interfaces;

import academy.beyondeducation.java.part1.classes.data.Company;

public class Interfaces {
    public static void main(String[] args) {
        Company company = new Company("Some boring name", "", 6, 1_000);
        // Create a profit service that performs an abstract operation, unaware of the result
        ExtendedProfitService extendedProfitService = new ExtendedProfitService();
        // Create and perform one operation
        Operation increase = new Increase();
        System.out.println("Increase --- ");
        System.out.println(company);
        extendedProfitService.update(company, increase, 1_000);
        System.out.println(company);
        // Create and perform a different operation, reusing the same profit service
        Operation decrease = new Decrease();
        System.out.println("Decrease --- ");
        System.out.println(company);
        extendedProfitService.update(company, decrease, 1_000);
        System.out.println(company);
    }
}
