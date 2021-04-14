package easylevel.pyramid;

public class Negash {

    public static void main(String[] args) {
//        Negash.mytrial();
//        Negash.fullPyramid();

    }
    // this is what I have within 10mnts window
    public static void mytrial(){
        for (int i = 0;i<6;i++){
            for (int j=0;j<i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        for (int i = 0;i<6;i++){
            for (int j=6;j>i;j--){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void fullPyramid(){
        for (int i = 0;i<=5;i++){
            for (int j = 5;j >= i;j--){
                System.out.print(" ");
            }
            for (int n=0;n<=i;n++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }


}
