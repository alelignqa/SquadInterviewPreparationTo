package easylevel.increasinganddecreasing;

import java.util.Scanner;

public class Practice {

    public static void leaveMeAlone() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input three numbers: ");
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();

        if (x < y && y < z) {
            System.out.println("Increasing");
        } else if (x > y && y > z) {
            System.out.println("Decreasing");

        } else {

            System.out.println("Neither");
        }


    }

    public static void main(String[] args) {
        Practice.leaveMeAlone();


    }
}




    
    
    
