package academy.beyondeducation.java.encapsulation;

import academy.beyondeducation.java.classes.data.Company;
import academy.beyondeducation.java.classes.service.CompanyNameAnalyser;

public class Encapsulation {
    public static void main(String[] args) {
        Company company = new Company("Some boring name", "", 6, 1_000);
        CompanyNameAnalyser companyNameAnalyser = new CompanyNameAnalyser();
        // the hasFancyName method is not available outside the class itself due to private visibility
        // boolean hasFancyName = companyNameAnalyser.hasFancyName(company);
        // System.out.println("hasFancyName = " + hasFancyName);
    }
}
