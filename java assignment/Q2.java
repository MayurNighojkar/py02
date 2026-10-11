
// Write a Java program to display all Armstrong numbers between two user-entered positive integers.

// A number is an Armstrong number if the sum of each digit raised to the power of the total number of digits equals the original number.

// For example, (153 = 1^3 + 5^3 + 3^3).

// Requirements:
// Create a method to count the digits.
// Create a method to calculate integer powers using loops.
// Create a method to check whether a number is an Armstrong number.
// Display all Armstrong numbers in the given inclusive range.

public class Q2 {
    static int countDigits(int n) {
        int c = 0;
        while (n > 0) { c++; n /= 10; }
        return c;
    }
    static long power(int base, int exp) {
        long result = 1;
        for (int i = 0; i < exp; i++) result *= base;
        return result;
    }
    static boolean isArmstrong(int n) {
        int digits = countDigits(n), temp = n;
        long sum = 0;
        while (temp > 0) {
            sum += power(temp % 10, digits);
            temp /= 10;
        }
        return sum == n;
    }
    public static void main(String[] args) {
        int start = 1, end = 500;   // or read with Scanner
        StringBuilder sb = new StringBuilder("Armstrong numbers:");
        for (int i = start; i <= end; i++)
            if (isArmstrong(i)) sb.append(' ').append(i);
        System.out.println(sb);
    }
}