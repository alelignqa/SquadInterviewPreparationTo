package easylevel.oddoreven;

import java.util.Scanner;

public class Negash {

    public static void main(String[] args) {
//
//        Negash.evenOrOdd(21);
//        Negash.evenOrOdd(22);
        Negash.evenOrOdd();

    }
    // I have managed to do this method within 10mnts
    public static void evenOrOdd(int number){
        if(number % 2 == 0){
            System.out.println("The number is Even");
        }else
            System.out.println("The number is Odd");
    }

    public static void evenOrOdd() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number \nThen I will let you know it is Even Or Odd");
        int number = in.nextInt();
        String even = "The number is Even";
        String odd = "The number is Odd";
        int trial = 3;
        while (trial > 0) {
            if (number % 2 == 0) {
                System.out.println(even);
            } else System.out.println(odd);
            trial--;
            if(trial == 0){
                break;
            }else number = in.nextInt();
        }
        in.close();
    }


}
