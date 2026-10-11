// Create an "Employee" class and compare two employee objects based on their annual salary.

// Requirements:
// Store employee name, employee ID, and monthly salary in private fields.
// Initialize each employee using a parameterized constructor.
// Implement a method that accepts another "Employee" object as a parameter.
// Compare both employees' annual salaries.
// Display which employee earns more, or report a tie.
// Implement a method that returns the employee object with the higher annual salary. If salaries are equal, return either employee.
// Test the methods using at least three employee objects.


class Employee {
    private String name;
    private int employeeId;
    private double monthlySalary;

    public Employee(String name, int employeeId, double monthlySalary) {
        this.name = name;
        this.employeeId = employeeId;
        this.monthlySalary = monthlySalary;
    }
    public String getName() { return name; }
    public double getAnnualSalary() { return monthlySalary * 12; }

    public void compareSalary(Employee other) {
        double mine = this.getAnnualSalary(), theirs = other.getAnnualSalary();
        if (mine > theirs) System.out.println(name + " earns more than " + other.name + ".");
        else if (mine < theirs) System.out.println(other.name + " earns more than " + name + ".");
        else System.out.println(name + " and " + other.name + " have equal annual salaries.");
    }
    public Employee getHigherPaid(Employee other) {
        return this.getAnnualSalary() >= other.getAnnualSalary() ? this : other;
    }
}

public class Q10 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Rahul", 101, 40000);
        Employee e2 = new Employee("Amit", 102, 50000);
        Employee e3 = new Employee("Priya", 103, 50000);

        e1.compareSalary(e2);
        e2.compareSalary(e3);

        Employee top = e1.getHigherPaid(e2).getHigherPaid(e3);
        System.out.println("Highest-paid employee: " + top.getName());
        System.out.println("Annual Salary: " + top.getAnnualSalary());
    }
}