// A Strong Number is a number whose value equals the sum of the factorials of its digits.

// For example, (145 = 1! + 4! + 5! = 145).

// Write a Java program to determine whether a given positive integer is a Strong Number.

// Requirements:
// Implement a separate method to calculate a digit's factorial.
// Extract digits using arithmetic operators.
// Calculate the sum of factorials.
// Compare the result with the original number.
// Handle single-digit inputs correctly.


public class Q3 {
    static long factorial(int d) {
        long f = 1;
        for (int i = 2; i <= d; i++) f *= i;
        return f;
    }
    static boolean isStrong(int n) {
        int temp = n;
        long sum = 0;
        while (temp > 0) {
            sum += factorial(temp % 10);
            temp /= 10;
        }
        return sum == n;
    }
    public static void main(String[] args) {
        int[] tests = {145, 1, 2, 123, 40585};
        for (int t : tests)
            System.out.println(t + (isStrong(t) ? " is a Strong Number." : " is not a Strong Number."));
    }
}