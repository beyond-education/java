package academy.beyondeducation.java.part1.encapsulation;

import academy.beyondeducation.java.part1.classes.data.Company;
import academy.beyondeducation.java.part1.classes.service.CompanyNameAnalyser;

public class Encapsulation {
    public static void main(String[] args) {
        Company company = new Company("Some boring name", "", 6, 1_000);
        CompanyNameAnalyser companyNameAnalyser = new CompanyNameAnalyser();
        // the hasFancyName method is not available outside the class itself due to private visibility
        // boolean hasFancyName = companyNameAnalyser.hasFancyName(company);
        // System.out.println("hasFancyName = " + hasFancyName);
    }
}
