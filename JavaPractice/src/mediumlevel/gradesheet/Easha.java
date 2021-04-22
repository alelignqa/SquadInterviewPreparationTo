package mediumlevel.gradesheet;

import java.util.Scanner;

public class Easha {
    // Write a Java program that determines a student’s grade.
    //The program will read three types of scores(quiz, mid-term, and final scores) and determine the grade based on
    // the following rules:
    //- if the average score >=90% =>grade=A
    //- if the average score >= 70% and <90% => grade=B
    //- if the average score>=50% and <70% =>grade=C
    //- if the average score<50% =>grade=F
    //
    //See the example output below:
    //
    //Quiz score: 80
    //
    //Mid-term score: 68
    //
    //Final score: 90
    //
    //Your grade is B.

    public static void main(String[] args) {

        Easha.grades();
    }

    public static void grades(){

        float quiz; float midTerm; float finalScore; float average;

        Scanner input = new Scanner(System.in);
        System.out.println("Quiz score: ");
        //int quiz = input.nextInt();
         quiz = input.nextFloat();
        System.out.println("Mid-term score: ");
        //int midTerm = input.nextInt();
         midTerm = input.nextFloat();
        System.out.println("Final Score: ");
        //int finalScore = input.nextInt();
        finalScore = input.nextFloat();
        //get average
         average = (quiz + midTerm + finalScore)/3;

        if(average >= 90){
            System.out.println("Grade is A");
        }else if (average >=70){
            System.out.println("Grade is B");
        } else if (average >=50 && average<70){
            System.out.println("Grade is C");
        }else{
            System.out.println("Grade is F");
        }
    }
}
