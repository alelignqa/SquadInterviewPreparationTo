package easylevel.pyramid;

public class Easha {


    public static void main(String[] args) {

        Easha.uglyPyramid();
    }

    public static void uglyPyramid() {
//         int i;
//         int j=5;
//         int k;
//
//         for(i = 0; i < j; i++){
//             for(k = 0; k <= i ; k++){
//                 System.out.print("* ");
//             }
//             System.out.println("");
        // this is how far i got and only created half a pyramid and only created half

        int i;
        int j;
        int k;


        for(i = 0; i < 5; i ++){
            for( j = 0 ; j <= 5 -i; j ++){// creates space
                System.out.print(" ");
            }
            for(k = 0; k <= i; k ++){// creates stars
                System.out.print("* ");
            }
            System.out.println();
        }

        //inverted

        for(i = 5; i >= 0; i --){
            for(j = 5; j >= i; j--){
                System.out.print(" ");
            }
            for(k =0; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
