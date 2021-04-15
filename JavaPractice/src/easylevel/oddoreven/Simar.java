package easylevel.oddoreven;

import com.google.gson.internal.bind.util.ISO8601Utils;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Simar {

public static void evenOddNumber() {


//    Scanner sc = new Scanner(System.in);
//    System.out.println("enter A Whole Number");
//    int num1 = sc.nextInt();
//    System.out.println("enter another Whole number");
//    int num2 = sc.nextInt();
//
//        if (num1>num2){
//            System.out.println(num1 + " number is the larger number");
//
//        }
//        else if (num2>num1){
//            System.out.println(num2 + "is the larger number");
//        }
//
//    if ((num1 / num2) == % ){
//        System.out.println("the number is a odd");
//    }else (num1 / num2 = ! %) {
//
//        System.out.println("this number is an even number");
//    }
//
//}
//    public static void main(String[] args) {
//            printOddOrEvenNumbers.evenOdddNum();
//
//    }
//}

//---------------------------------------------
}


public static void evenNumOrOddNum(){

    Scanner sc1= new Scanner(System.in);
    System.out.println("Enter a number");
    int num1= sc1.nextInt();


    if ((num1 %2)==0){
        System.out.println(num1 + " is an even number");

    }else{
        System.out.println(num1 + " is an Odd number");

    }

}

    public static void main(String[] args) {
        Simar.evenNumOrOddNum();
    }
}