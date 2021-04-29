package popularjavainterviewquestions.palindrome;

import java.util.Scanner;

public class RetoQuiz {
    public static void main(String[] args) {
        //Write a Java Program to find whether a string or number is palindrome or not.

        RetoQuiz.palindrome();
//        RetoQuiz.retry("mom");
    }



    public static void retry(String word){
        String reverse = "";
        for(int i = word.length()-1; i>=0; i--){
            reverse+= word.charAt(i);
        }
        if(word.equalsIgnoreCase(reverse)){
            System.out.println("It is a palindrome");
        }else{
            System.out.println("It is not a palindrome");
        }
    }

    public static void palindrome(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number/palindrome to check whether it is a palindrome: ");
        String word = scan.nextLine();
        int count = 5;
        while(word != null && count>0){
            String reverse = "";
            for(int i = word.length()-1; i>=0; i--){
                reverse+= word.charAt(i);
            }
            if(word.equalsIgnoreCase(reverse)){
                System.out.println("It is a palindrome");
            }else{
                System.out.println("It is not a palindrome");
            }
            count--;
            if(count>0){
                word = scan.nextLine();
            }
        }
        scan.close();
    }
}
