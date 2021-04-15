package easylevel.remainder;

public class Reto {

    public static void main(String[] args) {
        Reto.remainder(43,25);
    }

    public static void remainder(int num1, int num2){
        int remainder = num1%num2;
        System.out.println(num1 + " / "+ num2+ " = "+remainder);
    }
}
