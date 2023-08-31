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

    public static boolean isPowOfTwo(long p) {
        long q = p;
        long r = 0;
        int bitCount = 0;
        for (int i = 0; i < 64 && bitCount <= 1; i++) {
            r = q & 0x01;
            if (r == 1)
                bitCount++;
            q = q >>> 1;
        }
        return bitCount <= 1;
    }
    }

}