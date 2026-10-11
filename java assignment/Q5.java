
// Write a Java program to calculate the Greatest Common Divisor (GCD) and Least Common Multiple (LCM) of two positive integers.

// Requirements:
// Implement the Euclidean algorithm to calculate the GCD.
// Implement a separate method to calculate the LCM.
// Reuse the GCD method rather than duplicating its logic.
// Avoid integer overflow where possible by dividing before multiplying.
// Reject non-positive inputs.


public class Q5 {
    static int gcd(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
    static long lcm(int a, int b) {
        return (long) (a / gcd(a, b)) * b;
    }
    public static void main(String[] args) {
        int a = 84, b = 120;
        if (a <= 0 || b <= 0) {
            System.out.println("Both numbers must be positive.");
            return;
        }
        System.out.println("GCD: " + gcd(a, b));
        System.out.println("LCM: " + lcm(a, b));
    }
}