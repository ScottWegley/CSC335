package MersennePrimes;

public class Main {
    public static void main(String[] args) {
        long[] testNums = new long[]{3,7,31,127,8,0,-6,5,2, 19, 2305843009213693951L};
        for (long num : testNums) {
            System.out.println(num + " ||" + MersennePrime.isMPrime(num));
        }
    }
}