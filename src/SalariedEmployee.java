public class SalariedEmployee extends Employee {

    public SalariedEmployee(
        int id, String name,
        String position, double hourlyRate,
        int hoursWorked, double salary
    ) {
        super(id, name, position, 0, 0, salary);
    }
    
    @Override
    public double calculateSalary() {
        return getSalary(); // This salary is paid every month
    }
}
