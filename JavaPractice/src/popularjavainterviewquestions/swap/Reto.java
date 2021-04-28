package popularjavainterviewquestions.swap;

public class Reto {
    //Write a Java Program to swap two numbers using the third variable.

    public static void main(String[] args) {
        Reto.swapping2With3(77, 33);
        Reto.swapping2Without3(10,5);
    }

    //SwapTwoNumbersUsingThirdVariable
    public static void swapping2With3(int firstVariable, int secondVariable) {
        int thirdVariable;

        thirdVariable = firstVariable;
        firstVariable = secondVariable;
        secondVariable = thirdVariable;
        System.out.println("After swapping:" + "firstVariable= " + firstVariable + " thirdVariable= " + thirdVariable);
        System.out.println("After swapping:" + "secondVariable= " + secondVariable + " thirdVariable= " + thirdVariable);

    }


    //Swap2NumbersWithoutUsingThirdVariable
    public static void swapping2Without3(int x, int y) {
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swaping:"
                + " x = " + x + ", y = " + y);
    }
}

