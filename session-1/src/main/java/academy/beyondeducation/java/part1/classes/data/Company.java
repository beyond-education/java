package academy.beyondeducation.java.part1.classes.data;

public class Company {
    private String boringName;
    private String fancyName;
    private int numberOfEmployees;
    private double profit;

    public Company(String boringName, String fancyName, int numberOfEmployees, double profit) {
        this.boringName = boringName;
        this.fancyName = fancyName;
        this.numberOfEmployees = numberOfEmployees;
        this.profit = profit;
    }

    public String getBoringName() {
        return boringName;
    }

    public void setBoringName(String boringName) {
        this.boringName = boringName;
    }

    public String getFancyName() {
        return fancyName;
    }

    public void setFancyName(String fancyName) {
        this.fancyName = fancyName;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    @Override
    public String toString() {
        return "Company{" +
                "boringName='" + boringName + '\'' +
                ", fancyName='" + fancyName + '\'' +
                ", numberOfEmployees=" + numberOfEmployees +
                ", profit=" + profit +
                '}';
    }
}
