import java.text.DecimalFormat;

public class App {
    public static void main(String[] args) {
        Executive michael = new Executive(123, "Michael Sebastien", "CEO", 500000, 0, 0, 10000000, 0.35);

        DecimalFormat decimalFormat = new DecimalFormat("##,###,###.00");
        String formattedNumber = decimalFormat.format(michael.calculateSalary());

        System.out.println(formattedNumber);
    }
}