package popularjavainterviewquestions.swap;

public class Easha {
    public static void main(String[] args) {
        Easha.swapUsingWithoutVariable();
        Easha.swapUsingThirdVariable();



    }

    public static void swapUsingThirdVariable(){
        int a = 10;
        int b = 5;
        int z;


        z=a;
        a=b;
        b=z;

        System.out.println("A "+ a + " B " + b);
    }

    public static void swapUsingWithoutVariable(){
        int a = 10;
        int b = 5;

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a " + a + " b "+ b);

    }

}
