package easylevel.pyramid;

public class Reto {

    public static void main(String[] args) {
        Reto.makeHalfAPyramid(6);
        Reto.makeAFullPyramid(7);
    }

    public static void makeHalfAPyramid(int num) {// completed this in 10 minute
        for (int i = 0; i <= num; i++) {
            for (int k = 0; k <= i; k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }


    /// from google
    public static void makeAFullPyramid(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

