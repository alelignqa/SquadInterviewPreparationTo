package mediumlevel.fibonacci;

import java.util.ArrayList;
import java.util.List;

public class Negash {
         /*   Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */

    public static void main(String[] args) {
        Negash.fibonacci(40);
    }

    public static void fibonacci(int num){
        int first;
        int second = 1;
        int sum = 0;
        List<Integer> fibonacci = new ArrayList<>();

        for (int i = 0; i <= num; i++) {
            fibonacci.add(sum);
            first = second;
            second = sum;
            sum = first+second;
        }
        System.out.println(fibonacci);
    }


}
