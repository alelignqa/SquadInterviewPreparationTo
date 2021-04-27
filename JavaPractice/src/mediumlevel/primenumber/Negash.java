package mediumlevel.primenumber;

import java.util.ArrayList;

public class Negash {
    /*
     * Find list of Prime numbers from number 2 to 1 million.
     * Try the best solution as possible.Which will take less CPU life cycle.
     * Out put number of Prime numbers on the given range.
     */
    public static void main(String[] args) {
        // prime number is a number that id divisible only to 1 and itself
        // 2 3 5 7 11 13 ...
//    Negash.primeMyProcess(100);
        prime(20);
//        primeDirect(2,100);

    }

    public static void primeMyProcess(int num) {
        for (int i = 2; i < num; i++) {
            boolean isDivisible = !(i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0);
//            if (isDivisible || i==2 || i == 3|| i == 5|| i == 7) {
//                System.out.print(i+",");
//            }

            if (isDivisible || i == 2 || (i <= 7 && (i % 2 != 0))) {
                System.out.print(i + ",");
            }
        }
    }

    public static void prime(int n) {
        for (int j = 2; j < n; j++) { // Iteration amount and condition
            boolean prime = true;     // a variable to hold if prime is true
            int i = 2;                // this will help to rule out half of the iteration since division by 2 ??
            while (i <= j / 2) { // iterate as long as j/2 is greater than i
                if (j % i == 0) {// as long as j is divisible by i = j is not prime
                    prime = false;
                    break;          // break the loop
                }
                i++;
            }
            if (prime) {  // if j is a prime number print
                System.out.println(j);
            }
        }
    }

    public static ArrayList<Integer> primeDirect(int start, int end) {
        ArrayList<Integer> primes = new ArrayList<>();
        for (int n = start; n < end; n++) {
            boolean prime = true;
            int i = 2;
            while (i <= n / 2) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
                i++;
            }

            if (prime) {
                primes.add(n);
                System.out.print(n+",");
            }
        }
        return primes;
    }


}
