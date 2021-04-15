package easylevel.pyramid;

public class Reto {

    public static void main(String[] args) {
//        Reto.makeHalfAPyramid(10);
//        Reto.makeAFullPyramid(7);
        Reto.makeAInvertedFullPyramid(7);
    }

    public static void makeHalfAPyramid(int num) {// completed this in 10 minute
        for (int i = 0; i < num; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }


    /// from google
    public static void makeAFullPyramid(int num) {
        for (int i = 0; i < num; i++) {// i = 0; 0<7; 0++
            for (int j = 0; j < num - i; j++) {// j = 0; 0<6-0;0++
                System.out.print("-");
            }
            for (int k = 0; k <= i; k++) { // k = 0; 0<=0; 0++
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public static void makeAInvertedFullPyramid(int num) {
        for (int i = num; i >= 0; i--) {
            for (int j = num; j > i; j--) {
                System.out.print("-");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}

