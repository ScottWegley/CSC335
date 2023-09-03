package HappyPrimes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = -1;
        try {
            System.out.println("Please type an integer.");
            n = input.nextInt();
            if (n < 0)
                throw new InputMismatchException();
            if (n == 0) {
                throw new IllegalArgumentException("0 is neither prime nor composite");
            }
            if (PrimeNumber.isPrime(n)) {
                if (HappyNumber.isHappy(n)) {
                    System.out.println(n + " is a Happy-Prime");
                } else {
                    System.out.println(n + " is a Prime");
                }
            } else {
                if (HappyNumber.isHappy(n)) {
                    System.out.println(n + " is a Happy-Composite");
                } else {
                    System.out.println(n + " is a Composite");
                }
                System.out.println("Factors");
                for (int p : PrimeNumber.primeFactors(n)) {
                    System.out.println(p + " || " + (HappyNumber.isHappy(p) ? "Happy" : "Unhappy"));
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Input must be a positive integer.");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } finally {
            input.close();
        }
    }
}