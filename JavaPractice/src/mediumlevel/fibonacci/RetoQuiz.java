package mediumlevel.fibonacci;

public class RetoQuiz {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
        RetoQuiz.fibonacci(40);

    }

    public static void fibonacci(int num){
        int sum = 0;
        int prevNum = 0;
        int nextNum = 1;
        for(int i = 0; i<num; i++){
            System.out.println(prevNum + " "+ i);
            sum = prevNum + nextNum;
            prevNum = nextNum;
            nextNum = sum;
        }
    }
}
