package mediumlevel.factorial;

public class Reto {
    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */

        Reto.factorial(5);

    }

    //it took me over 30 minutes to do this by myself. I am stoopid :)

    public static void factorial(int num){
//        int factorialEquation = factNum*(factNum-1);
//        System.out.println(factorialEquation);
        int factNum = 1;
        for(int i = 0; i<num; i++) {
            factNum *= num - i;
//            int fact = factorial1 * factNum;
        }
        System.out.println(num + "! = "+factNum);
    }

    public static int factorialRecursion(int num) {
        if (num == 0) {
            return 1;
        } else {
            return ((num) * factorialRecursion(num - 1));
        }
    }

    }
