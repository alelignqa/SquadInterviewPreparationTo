package easylevel.remainder;

public class Negash {

    public static void main(String[] args) {
        Negash.remainder(10,20);

    }

    public static void remainder(int numOne, int numTwo) {
        if (numOne > numTwo) {
            int remainder = numOne % numTwo;
            System.out.println(remainder);
        }
    }
}
