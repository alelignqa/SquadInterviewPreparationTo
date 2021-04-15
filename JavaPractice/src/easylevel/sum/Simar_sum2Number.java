package easylevel.sum;

import java.util.Scanner;

public class Simar_sum2Number {

    public static void sumOf2(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int num1=input.nextInt();
        System.out.println("enter another number");
        int num2=input.nextInt();

        int sum=num1 + num2;

        System.out.println("the sum of 2 numbers is = "+ sum);

    }

    public static void main(String[] args) {
        Simar_sum2Number.sumOf2();
    }
}
//----------------------------------------finished in 3:29