package mediumlevel.factorial;

public class RetoPracticeOneMoreTime {
    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        RetoPracticeOneMoreTime.factorial(5);
    }

    public static void factorial(int num) {
        int n = 1;
        for (int i = 0; i < num; i++) {
            n *= num - i;
        }
        System.out.println(n);
    }


//    public static int factorialRecursion(int num){
//        try {
//            return ((num) * factorialRecursion(num - 1));
//
//        }catch (Exception e){
//            System.out.println("oops an exception");
//        }
//    }
}


