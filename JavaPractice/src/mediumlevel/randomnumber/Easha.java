package mediumlevel.randomnumber;

import java.util.Comparator;
import java.util.Random;
import java.util.stream.IntStream;

public class Easha {

    public static void main(String[] args) {
        Easha.randomNumber(1, 8);
//        Easha.rand();

    }



    public static void randomNumber(int min, int max) {
        Random random = new Random();

        int numOne = random.nextInt(max);
        int numTwo = random.nextInt(min);
//        int randomNum = numOne - numTwo;

               int randomNum = random.nextInt(max + min);//7 + 1



        System.out.println(randomNum);
    }
    public static void rand(){
        Random random = new Random();
        IntStream num = random.ints(1, 8);

        System.out.println(num);

}
    //
//         int randomNum = random.nextInt((max - min+1) + min);//7 + 1
//         System.out.println(randomNum);


//         for(int i = min; i< max; i++){
//             int finalnum = random.nextInt(i);
//             System.out.println(finalnum);
//         }
}
