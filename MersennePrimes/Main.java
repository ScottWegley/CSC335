package MersennePrimes;

public class Main {
    public static void main(String[] args) {
        long[] testNums = new long[]{};
        for (long num : testNums) {
            System.out.println(num + " M Prime Status: " + MersennePrime.isPrime(num));
        }
    }
}