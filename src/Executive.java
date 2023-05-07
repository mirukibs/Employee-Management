public class Executive extends Employee {

    private double bonus;
    private double sharePercentage;
    
    public Executive(
        int id, String name,
        String position, double bonus,
        double hourlyRate, int hoursWorked,
        double salary, double sharePercentage
    ) {
        super(id, name, position, hourlyRate, hoursWorked, salary);
        this.bonus = bonus;
        this.sharePercentage = sharePercentage;
    }

    public double getBonus() {
        return bonus;
    }

    public double getSharePercentage() {
        return sharePercentage;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void setSharePercentage(double sharePercentage) {
        this.sharePercentage = sharePercentage;
    }

    @Override
    public double calculateSalary() {
        double dividend = getSalary() * sharePercentage;
        return getSalary() + dividend + bonus; // Salary = Salary + Dividend + PerformanceBonus
    }
    
}
