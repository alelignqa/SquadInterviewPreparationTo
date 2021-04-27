package popularjavainterviewquestions.iteratearraylist;

public class Negash {
    //Write a Java Program to iterate ArrayList using for-loop, while-loop, and advance for-loop.

    public static void main(String[] args) {
        int[] num = {12,15,89,36,47,89,50,42,58};

        for (int i=0;i< num.length;i++){
            System.out.println(num[i]);
        }

        for (int newNum: num){
            System.out.println(newNum);
        }

        int n = num.length-1;
        while (n > 0){
            System.out.println(num[n]);
            n--;
        }

        int m = 0;
        while (num.length > m){
            System.out.println(num[m]);
            m++;
        }

    }
}
