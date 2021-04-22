package mediumlevel.fibonacci;

import java.util.ArrayList;
import java.util.List;

public class Negash {
         /*   Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */

    public static void main(String[] args) {
//        Negash.fibonacci(40);
        Negash.fiboRecursion(40);
//        Negash.printFibo(40);
    }

    public static void fibonacci(int num) {
        int first;
        int second = 1;
        int sum = 0;
        List<Integer> fibonacci = new ArrayList<>();

        for (int i = 0; i <= num; i++) {
            fibonacci.add(sum);
            System.out.print(sum+",");
            first = second;
            second = sum;
            sum = first + second;
        }
        System.out.println(fibonacci);
    }

    static int first = 0, second = 1, sum=0;
    public static void fiboRecursion(int count) {

        if (count > 0) {
            sum = first + second;
            first = second;
            second = sum;
            System.out.print(sum+",");
            fiboRecursion(count - 1);
        }
    }

    static int n1 = 0, n2 = 1, n3 = 0;

    static void printFibo(int count) {
        List<Integer> ad = new ArrayList<>();
//        int n1 = 0, n2 = 1, n3 = 0;
        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
//            System.out.print(" " + n3);
            ad.add(n3);
            printFibo(count - 1);
        } // need to declare the variables outside and n1 and n2 needs to be printed separately
        for (Integer fib: ad){
            System.out.print(fib+",");
        }
    }
}
// [0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155]