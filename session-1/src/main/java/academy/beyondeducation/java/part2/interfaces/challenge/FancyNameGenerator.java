package academy.beyondeducation.java.part2.interfaces.challenge;

import academy.beyondeducation.java.part1.classes.data.Company;

public class FancyNameGenerator {
    public void generateFancyName(Company company, Fancier fancier) {
        String boringName = company.getBoringName();
        String fancyName = fancier.fancy(boringName);
        company.setFancyName(fancyName);
    }
}
