package easylevel.oddoreven;

import java.util.Scanner;

public class Easha {

    public static void main(String[] args) {

    Easha.whatNumberIsThat();
    }

    public static void whatNumberIsThat(){
//        Scanner num = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int userNum = num.nextInt();
//        Boolean
//
//        if (userNum % 2==0){
//            System.out.println("Its even");
//        }else{
//            System.out.println("Its odd");
//        }
        // this is how far i got, i suck so bad

        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number");
        int userNum = num.nextInt();

        if (userNum % 2==0){
            System.out.println("Its even");
        }else{
            System.out.println("Its odd");
        }


    }
}
