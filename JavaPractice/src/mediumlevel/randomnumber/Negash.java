package mediumlevel.randomnumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Negash {
    //Write Java program to generate a random number between 1 to 8.

    public static void main(String[] args) {
        System.out.println(Negash.random());

//        System.out.println(Negash.random(10));

    }

    public static int random(){
        int num;
        num = (int)(Math.random()*8);
       return num;
    }

    public static List<Integer> random(int count){
        List<Integer> num = new ArrayList<>();
        while (count > 0){
             num.add((int)(Math.random() * 8));
            count--;
        }
        return num;
    }
}
