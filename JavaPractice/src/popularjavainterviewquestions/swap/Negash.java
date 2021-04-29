package popularjavainterviewquestions.swap;

public class Negash {


    /**
     * Write a Java Program to swap two numbers without using the third variable.
     */

    public static void main(String[] args) {
        Negash.swapWithThirdVariable();
        System.out.println();
        Negash.swapWithThirdOutVariable();
    }

    /**
     * Write a Java Program to swap two numbers using the third variable.
     */
    public static void swapWithThirdVariable(){
        int val1 = 20;
        int val2 = 100;
        int temp;
        System.out.println("Value before swapping val1: " + val1+ " and val2: "+ val2 );
        // to swap using temp as a third variable

        temp = val1; // assign the value of val1 to temp - val1 will be empty
        val1 = val2; // assign the value of val2 to val1 - val2 will be empty
        val2 = temp; // now assign the temp value to val2

        System.out.println("Value after swapping val1: " + val1+ " and val2: "+ val2 );


    }

    public static void swapWithThirdOutVariable(){
        int val1 = 20;
        int val2 = 100;
        System.out.println("Value before swapping val1: " + val1+ " and val2: "+ val2 );

        val1 = val1 + val2; // adding the value of both variable to one - val1 = 120
        val2 = val1 - val2; // the new val2 will be 120-the initial value of val2 - val2 = 120-100
        val1 = val1 - val2; // new val1 will be 120-val2 - val1 = 120-20

        System.out.println("Value after swapping val1: " + val1+ " and val2: "+ val2 );

    }


}
