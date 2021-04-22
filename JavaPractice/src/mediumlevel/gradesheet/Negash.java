package mediumlevel.gradesheet;

public class Negash {
        /*
    Write a Java program that determines a student’s grade.
    The program will read three types of scores(quiz, mid-term, and final scores) and determine the grade based on
     the following rules:
    - if the average score >=90% =>grade=A
    - if the average score >= 70% and <90% => grade=B
    - if the average score>=50% and <70% =>grade=C
    - if the average score<50% =>grade=F

    See the example output below:
        Quiz score: 80
        Mid-term score: 68
        Final score: 90
        Your grade is B.

         */

    public static void main(String[] args) {
    Negash.grading(90,90,90);
    Negash.grading(80,68,90);
    Negash.grading(70,68,70);
    Negash.grading(50,49,50);

    }

    public static void grading(int scoreQuiz,int scoreMidTerm,int scoreFinal){

        int grade = (int) (scoreQuiz + scoreMidTerm + scoreFinal)/3;

        if(grade >= 90){
            System.out.println("Your grade is A.");
        }else if (grade >=70 && grade < 90){
            System.out.println("Your grade is B.");
        }else if (grade >=50 && grade < 70){
            System.out.println("Your grade is C.");
        }else if (grade < 50){
            System.out.println("Your grade is D.");
        }
    }
}
