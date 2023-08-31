package HappyPrimes;

public class PrimeNumber {
    public static boolean isPrime(int p) {
        for (long i = 2L; i <= Math.sqrt(p); i++) {
            if (p % i == 0) {
                return false;
            }
        }
        return p != 1L && p != 0L;
    }

    public static int[] primeFactors(int p) throws IllegalArgumentException {
        return new int[] {};
    }

}
