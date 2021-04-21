package mediumlevel.factorial;

public class Easha {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        //i*(i-1)

        Easha.factorial(5);
    }

    public static void factorial (int myFactor){

        int factorial=myFactor; // to pass number you want to set as factorials of

        for(int i = factorial; i > 1; i--){//2
            factorial *= i-1; // 4*5 = 20; 3*20 = 60; 3*60 = 120; 1*120 = 120;

//            System.out.println(factorial);// print to see how the math is working inside

            }
        System.out.println(factorial);// print total
        }



}
