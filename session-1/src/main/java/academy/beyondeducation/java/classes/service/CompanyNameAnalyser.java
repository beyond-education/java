package academy.beyondeducation.java.classes.service;

import academy.beyondeducation.java.classes.data.Company;

public class CompanyNameAnalyser {
    private boolean hasFancyName(Company company) {
        String fancyName = company.getFancyName();
        return fancyName != null && !fancyName.isBlank();
    }
}
