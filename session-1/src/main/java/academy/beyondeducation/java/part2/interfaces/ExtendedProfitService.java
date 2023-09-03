package academy.beyondeducation.java.part2.interfaces;

import academy.beyondeducation.java.part1.classes.data.Company;

public class ExtendedProfitService {
    public void update(Company company, Operation operation, double amount) {
        double current = company.getProfit();
        double updated = operation.perform(current, amount);
        company.setProfit(updated);
    }
}
