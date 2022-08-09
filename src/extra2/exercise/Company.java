package extra2.exercise;

public class Company {
    private String name;
    private long revenue;
    private long expense;

    private String industry;
    public Company(String name, long revenue, long expense, String industry) {
        this.name = name;
        this.revenue = revenue;
        this.expense = expense;
        this.industry = industry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getRevenue() {
        return revenue;
    }

    public void setRevenue(long revenue) {
        this.revenue = revenue;
    }

    public long getExpense() {
        return expense;
    }

    public void setExpense(long expense) {
        this.expense = expense;
    }

    public String getIndustry() {
        return industry;
    }

//    public String toString() {
//        return
//    }
}
