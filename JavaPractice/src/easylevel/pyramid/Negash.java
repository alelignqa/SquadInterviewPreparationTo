package easylevel.pyramid;

public class Negash {

    public static void main(String[] args) {
        Negash.myTrial(6);
        Negash.fullPyramid(10);

    }

    // this is what I have within 10mnts window
    public static void myTrial(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        for (int i = 0; i < height; i++) {
            for (int j = height; j > i; j--) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void fullPyramid(int howTall) {
        for (int i = 0; i <= howTall; i++) {
            for (int j = howTall; j >= i; j--) {
                System.out.print(" ");
            }
            for (int n = 0; n <= i; n++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        for (int i = 0; i <= howTall; i++) {

            for (int n = 0; n <= i; n++) {
                System.out.print(" ");
            }
            for (int j = howTall; j >= i; j--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }


}
