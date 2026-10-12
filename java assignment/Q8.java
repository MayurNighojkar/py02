import java.util.InputMismatchException;
import java.util.Scanner;

public class Q8 {

    private static final int[] BONUS_PERCENT = {0, 0, 5, 10, 15, 20};
    private static final int MONTHS_IN_YEAR = 12;

    private String name;
    private int employeeId;
    private double monthlySalary;
    private int rating;

    public Q8(String name, int employeeId, double monthlySalary, int rating) {
        this.name = name;
        this.employeeId = employeeId;
        setMonthlySalary(monthlySalary);
        setRating(rating);
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary < 0) {
            throw new IllegalArgumentException("Monthly salary cannot be negative.");
        }
        this.monthlySalary = monthlySalary;
    }

    public void setRating(int rating) {
        if (rating < 1 || rating > 5) {
            throw new IllegalArgumentException("Rating must be between 1 and 5.");
        }
        this.rating = rating;
    }

    public double getAnnualSalary() {
        return monthlySalary * MONTHS_IN_YEAR;
    }

    public double getBonus() {
        return getAnnualSalary() * BONUS_PERCENT[rating] / 100;
    }

    public double getTotalCompensation() {
        return getAnnualSalary() + getBonus();
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Monthly Salary: " + monthlySalary);
        System.out.println("Annual Salary: " + getAnnualSalary());
        System.out.println("Annual Bonus: " + getBonus());
        System.out.println("Total Annual Compensation: " + getTotalCompensation());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Employee ID: ");
            int id = sc.nextInt();
            System.out.print("Monthly Salary: ");
            double salary = sc.nextDouble();
            System.out.print("Performance Rating: ");
            int rating = sc.nextInt();

            System.out.println();
            Q8 emp = new Q8(name, id, salary, rating);
            emp.displayDetails();
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Invalid input: please enter numbers where numbers are expected.");
        }
    }
}