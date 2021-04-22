package mediumlevel.fibonacci;

public class Easha {

    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */

        Easha.fibonacci();
    }

    public static void fibonacci(){
       int j =0;
       int k =1;
       int n=0;
        for(int i =0; i <= 40; i++){
            System.out.println(k+",");
             n = j +k;//0+1 = 1
             j = k;//1
            k =n;//1



        }
    }

}
