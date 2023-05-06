public class Manager extends Employee {

    private double bonus;

    public Manager(
        int id, String name, String position,
        double hourlyRate, int hoursWorked, double salary,
        double bonus
    ) {
        super(id, name, position, 0, 0, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getSalary() + bonus; // This salary is paid monthly
    }
    
}
