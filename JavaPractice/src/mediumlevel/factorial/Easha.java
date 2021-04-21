package mediumlevel.factorial;

public class Easha {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */


        Easha.factorial(5);
        System.out.println( Easha.factorialUsingRecursion(6));
    }

    public static void factorial (int myFactor){

        int factorial=myFactor; // to pass number you want to set as factorials of

        for(int i = factorial; i > 1; i--){//2
            factorial *= i-1; // you want to multiple your number by the i -1 to get the number preceding i
            // 4*5 = 20; 3*20 = 60; 3*60 = 120; 1*120 = 120;

//            System.out.println(factorial);// print to see how the math is working inside

            }
        System.out.println(factorial);// print total
        }


        public static int factorialUsingRecursion(int myFactor) {
            int factorial = myFactor;
            int i = factorial;
            if (myFactor > 1) {//5 > 1: true
                myFactor--;//5-1 = 4
                factorial *= factorialUsingRecursion(i - 1); //5 * 4 = 20// all the method is doing is holding i -1


            }
            return factorial;
        }

}
