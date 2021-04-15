package easylevel.max;

import java.util.Scanner;

public class Reto {

    public static void main(String[] args){
       Reto.max(45,67);
       Reto.maxWithScanner();
    }

    public static void max(int num1, int num2){
        if(num1>num2){
            System.out.println("The max between "+num1 +" & "+num2+": "+num1);
        }else{
            System.out.println("The max between "+num1 +", "+num2+": "+num2);
        }
    }

    public static void maxWithScanner(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Input first number: ");
        int num1 = scan.nextInt();
        System.out.print("Input second number: ");
        int num2 = scan.nextInt();
        if(num1>num2){
            System.out.println("The maximum number is: "+num1);
        }else if(num2>num1){
            System.out.println("The maximum number is: "+num2);
        }else{
            System.out.println("Sheesh enter a real number please!!");
        }
    }
}
