package academy.beyondeducation.java.part2.interfaces.challenge;

import academy.beyondeducation.java.part1.classes.data.Company;

public class Application {
    public static void main(String[] args) {
        Company company = new Company("Boring Name", "", 6, 1_000);
        System.out.println(company);
        FancyNameGenerator fancyNameGenerator = new FancyNameGenerator();
        Fancier bigSmallBig = new BigSmallBigFancier();
        fancyNameGenerator.generateFancyName(company, bigSmallBig);
        System.out.println(company);
        Fancier oneTwoThree = new OneTwoThreeFancier();
        fancyNameGenerator.generateFancyName(company, oneTwoThree);
        System.out.println(company);
    }
}
