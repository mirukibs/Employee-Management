public class HourlyEmployee extends Employee {

    public HourlyEmployee(
        int id,
        String name,
        String position,
        double hourlyRate,
        int hoursWorked,
        int merit,
        double salary
    ) {
        super(id,name, position, hourlyRate, hoursWorked, merit, salary);
    }

    @Override
    public double calculateSalary() {
        return getHourlyRate() * getHoursWorked();
    }
}