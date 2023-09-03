package HappyPrimes;

import java.util.ArrayList;

public class PrimeNumber {

    /**
     * Determine whether or not a specified number is prime.
     * @param p The number to check.
     * @return True if the number is prime, false if not.
     */
    public static boolean isPrime(int p) {
        for (long i = 2L; i <= Math.sqrt(p); i++) {
            if (p % i == 0) {
                return false;
            }
        }
        return p != 1L && p != 0L;
    }

    /**
     * Modified algorithm derived from work of Vishwas Garg.
     * @param p The number to return the prime factors of.
     * @return An array of integer factors of p.
     * @throws IllegalArgumentException If the number is 0 or less it's an Illegal Argument.
     */
    public static int[] primeFactors(int p) throws IllegalArgumentException {
        if (p < 0)
            throw new IllegalArgumentException("Numbers less than 0 are Illegal Arguments.");
        if(p == 0){
            throw new IllegalArgumentException("0 is neither prime nor composite");
        }
        ArrayList<Integer> factors = new ArrayList<>();
        while (p % 2 == 0) {
            p *= 0.5;
            factors.add(2);
        }

        for (int i = 3; i <= Math.sqrt(p); i += 2) {
            while (p % i == 0) {
                p /= i;
                factors.add(i);
            }
        }

        if (p != 2) {
            factors.add(p);
        }

        int[] out = new int[factors.size()];
        for (int i = 0; i < out.length; i++) {
            out[i] = factors.get(i);
        }
        return out;
    }

}
