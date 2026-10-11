// Design a "Student" class to calculate and display a student's academic result for five subjects.

// Requirements:
// Store the student's name, roll number, and five subject marks in private fields.
// Initialize student details through a parameterized constructor.
// Validate each mark to ensure it is between "0" and "100".
// Implement separate methods to calculate total marks, percentage, and result status.
// Consider a student passed only if every subject mark is at least "40".
// Display the student's complete result using a separate method.



class Student {
    private String name;
    private int rollNumber;
    private int[] marks = new int[5];

    public Student(String name, int rollNumber, int m1, int m2, int m3, int m4, int m5) {
        this.name = name;
        this.rollNumber = rollNumber;
        int[] input = {m1, m2, m3, m4, m5};
        for (int i = 0; i < 5; i++) setMark(i, input[i]);
    }
    public void setMark(int index, int mark) {
        if (mark < 0 || mark > 100)
            throw new IllegalArgumentException("Mark must be between 0 and 100: " + mark);
        marks[index] = mark;
    }
    public int getMark(int index) { return marks[index]; }
    public String getName() { return name; }
    public int getRollNumber() { return rollNumber; }

    public int calculateTotal() {
        int total = 0;
        for (int m : marks) total += m;
        return total;
    }
    public double calculatePercentage() { return calculateTotal() / 5.0; }
    public String getResultStatus() {
        for (int m : marks) if (m < 40) return "FAIL";
        return "PASS";
    }
    public void displayResult() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Total Marks: " + calculateTotal() + "/500");
        System.out.println("Percentage: " + calculatePercentage() + "%");
        System.out.println("Result: " + getResultStatus());
    }
}

public class Q6 {
    public static void main(String[] args) {
        new Student("Rahul", 21, 85, 76, 91, 68, 80).displayResult();
        System.out.println();
        new Student("Asha", 22, 90, 35, 88, 70, 66).displayResult();
    }
}