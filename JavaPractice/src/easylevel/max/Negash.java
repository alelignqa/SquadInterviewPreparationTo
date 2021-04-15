package easylevel.max;

import java.util.Scanner;

public class Negash {

    public static void main(String[] args) {
//        Negash.maxNumber(400, 600);
        Negash.maxNumber();
    }

    public static void maxNumber(int val1, int val2) {
        String max = " is the max number";
        if (val1 > val2) {
            System.out.println(val1 + max);
        } else if (val2 > val1) {
            System.out.println(val2 + max);
        } else
            System.out.println(" they are equal ");
    }

    public static void maxNumber() {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter two numbers ");
        String max = " is the max number";
        int val1 = in.nextInt();
        int val2 = in.nextInt();
        int numberOfAttempt = 3;
        while (numberOfAttempt > 0) {
            if (val1 > val2) {
                System.out.println(val1 + max);
            } else if (val2 > val1) {
                System.out.println(val2 + max);
            } else
                System.out.println(" they are equal ");
            numberOfAttempt--;
            if (numberOfAttempt == 0) {
                break;
            } else
                val1 = in.nextInt();
                val2 = in.nextInt();
        }
    }
}
