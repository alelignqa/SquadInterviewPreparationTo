package mediumlevel.factorial;

public class Negash {
    /*
     * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
     * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
     *
     */
    public static void main(String[] args) {
//        Negash.factorial(5);
        System.out.println(Negash.factorial1(5));

    }

    public static void factorial(int num){
        int factorial = 1;  // declare and initialize a variable to hold the factorial result
                            // I initialized to 1 because it is a multiplication
        for (int i = num;i>=1;i--){ // looping start from num down to 1
            factorial = factorial*i; // multiply by i and reset the factorial variable with the result
        }
        System.out.println(factorial);
    }

    public static int factorial1(int num){
        if (num == 1){
            return 1;
        }else {
          return  num * factorial1(num-1);
        }
    }


}
