package mediumlevel.randomnumber;

public class Reto {

    public static void main(String[] args) {
        //Write Java program to generate a random number between 1 to 8.
        Reto.randomNumGenerator(1,8);
//        Reto.randomNumGenerator1(1,8);
    }

    public static void randomNumGenerator(int firstNum, int secondNum){
        for(int i = firstNum; i<=secondNum; i++) {
            int randomNum = (int) (Math.random() * (secondNum - firstNum) + firstNum);
            System.out.println(randomNum);
        }
    }

    public static void randomNumGenerator1(int firstNum, int secondNum){
            int randomNum = (int) (Math.random() * (secondNum - firstNum) + firstNum);
            System.out.println(randomNum);
    }
}
