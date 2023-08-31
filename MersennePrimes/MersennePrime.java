package MersennePrimes;

public class MersennePrime {
    public static boolean isMPrime(long n) {
        return false;
    }

    public static boolean isPrime(long p) {
        for (long i = 2L; i <= Math.sqrt(p); i++) {
            if (p % i == 0) {
                return false;
            }
        }
        return p != 1L && p != 0L;
    }
    }

}