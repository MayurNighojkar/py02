
// Write a Java program to find the second-largest distinct digit in a positive integer without using arrays, sorting, or built-in maximum functions.

// Requirements:
// Process the number digit by digit.
// Ignore repeated occurrences of the same digit.
// Return the second-largest distinct digit.
// If fewer than two distinct digits exist, display an appropriate message.


public class Q1 {
    static int secondLargestDistinctDigit(long n) {
        int largest = -1, second = -1;
        while (n > 0) {
            int d = (int) (n % 10);
            if (d > largest) {
                second = largest;
                largest = d;
            } else if (d != largest && d > second) {
                second = d;
            }
            n /= 10;
        }
        return second;
    }

    public static void main(String[] args) {
        long[] tests = {985998, 7777, 1221, 1000, 987654};
        for (long t : tests) {
            int r = secondLargestDistinctDigit(t);
            if (r == -1) System.out.println(t + ": Fewer than two distinct digits.");
            else System.out.println(t + ": Second-largest distinct digit: " + r);
        }
    }
}