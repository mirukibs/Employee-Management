public abstract class Employee {
    private int id;
    private String name;
    private String position;
    private double hourlyRate;
    private int hoursWorked;
    private double salary;

    public Employee(int id, String name, String position, double hourlyRate, int hoursWorked, int merit, double salary) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract double calculateSalary();

    public void promote(String newTitle) {
        System.out.println(this.name + "=> Promoted to: " + newTitle);
    }
}
