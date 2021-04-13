package easylevel.remainder;

public class Reto {

    public static void main(String[] args) {
        Reto.remainder(25,43);
    }

    public static void remainder(double num1, double num2){
        double remainder = num1/num2;
        System.out.println(num1 + " / "+ num2+ " = "+remainder);
    }
}
