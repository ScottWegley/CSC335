package HappyPrimes;

public class HappyNumber {
    public static boolean isHappy(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException("Numbers less than 0 are invalid");
        }
        if(n == 0){return false;}
        while (true) {
            String nS = Integer.toString(n);
            int[] digits = new int[nS.length()];
            for (int i = 0; i < digits.length; i++) {
                digits[i] = Integer.parseInt(String.valueOf(nS.charAt(i)));
            }
            n = 0;
            for (int d : digits) {
                n += d * d;
            }
            if (n == 4) {
                return false;
            }
            if(n== 1){
                return true;
            }
        }
    }
}
