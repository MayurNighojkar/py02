// Write a Java program to print the prime factorization of a given integer without using arrays, collections, or external libraries.

// Requirements:
// Identify prime factors using repeated division.
// Display repeated factors with their multiplicities.
// Handle the number "1" separately.
// Reject inputs less than "1".


public class Q4 {
    static void primeFactorization(long n) {
        if (n < 1) { System.out.println(n + ": Invalid input (must be >= 1)."); return; }
        if (n == 1) { System.out.println("1: 1 has no prime factors."); return; }
        StringBuilder sb = new StringBuilder();
        long original = n;
        for (long f = 2; f * f <= n; f++) {
            int count = 0;
            while (n % f == 0) { n /= f; count++; }
            if (count > 0) {
                if (sb.length() > 0) sb.append(" x ");
                sb.append(f).append('^').append(count);
            }
        }
        if (n > 1) {
            if (sb.length() > 0) sb.append(" x ");
            sb.append(n).append("^1");
        }
        System.out.println(original + ": Prime factorization: " + sb);
    }
    public static void main(String[] args) {
        long[] tests = {360, 1, 13, 64, 210, 0};
        for (long t : tests) primeFactorization(t);
    }
}