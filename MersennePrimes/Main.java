package MersennePrimes;

public class Main {
    public static void main(String[] args) {
        long[] testNums = new long[]{3,7,31,127,8,0,-6,5,2};
        for (long num : testNums) {
            System.out.println(num + " M Prime Status: " + MersennePrime.isMPrime(num));
        }
    }
}