package mediumlevel.gradesheet;

import java.util.Scanner;

public class Reto {
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
        Reto.gradeSheet();
    }

    public static void gradeSheet() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Quiz score: ");
        double quizScore = scan.nextInt();
        System.out.print("Mid-term score: ");
        double midtermScore = scan.nextDouble();
        System.out.print("Final score: ");
        double finalScore = scan.nextDouble();

        double averageScore = (quizScore + midtermScore + finalScore) / 3;
        if (averageScore >= 90) {
            System.out.println("Your grade is A");
        } else if (averageScore < 90 && averageScore >= 70){
            System.out.println("Your grade is B");
        } else if (averageScore < 70 && averageScore >= 50  ) {
            System.out.println("Your grade is C");
        } else if (averageScore < 50) {
            System.out.println("Your grade is F");
        } else {
            System.out.println("Are you even trying?!? ");
        }
    }
}
