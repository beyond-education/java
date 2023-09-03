package academy.beyondeducation.java.classes.service;

import academy.beyondeducation.java.classes.data.Company;

public class ProfitService {
    public void increase(double amount, Company company) {
        double current = company.getProfit();
        double updated = current + amount;
        company.setProfit(updated);
    }

    public void decrease(double amount, Company company) {
        double current = company.getProfit();
        double updated = current - amount;
        company.setProfit(updated);
    }
}
