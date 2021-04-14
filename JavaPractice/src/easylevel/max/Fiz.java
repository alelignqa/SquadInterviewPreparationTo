package easylevel.max;

import java.util.Scanner;

public class Fiz {



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input two numbers: ");
        int x = scan.nextInt();
        int y = scan.nextInt();

        if (x > y) {
            System.out.println(x + " is the max.");
        } else if (y > x) {
            System.out.println(y + " is the max.");
        } else {
            System.out.println("Neither");

        }
    }


}
