import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your annual income:");
        int income = sc.nextInt();
        double tax = 0;
        double inHandSalary;

        if (income <= 500000) {
            tax = 0;
        } else if (income > 500000 && income <= 1000000) {
            tax = income * 0.20;
        } else {
            tax = income * 0.30;
        }

        inHandSalary = income - tax;
        System.out.println("Your in-hand salary after tax is: ₹" + inHandSalary);

        sc.close();
    }
}
