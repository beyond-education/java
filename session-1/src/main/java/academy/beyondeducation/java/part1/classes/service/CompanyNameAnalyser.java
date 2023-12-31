package academy.beyondeducation.java.part1.classes.service;

import academy.beyondeducation.java.part1.classes.data.Company;

public class CompanyNameAnalyser {
    private boolean hasFancyName(Company company) {
        String fancyName = company.getFancyName();
        return fancyName != null && !fancyName.isBlank();
    }
}
