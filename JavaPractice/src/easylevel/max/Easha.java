package easylevel.max;

import java.util.Scanner;

public class Easha {

    public static void main(String[] args) {

//        int a = 10;
//        int b = 20;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = input.nextInt();
        System.out.println("Enter another number");
        int b = input.nextInt();

//        System.out.println(Math.max(a,b));

        if (a < b){
            System.out.println(b + " is the max number");
        } else if(a > b){
            System.out.println(a+ " is the max number");
        }
    }
}
