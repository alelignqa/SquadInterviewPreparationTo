package popularjavainterviewquestions.reversestring;

public class Negash {
    /**
     * Write a Java Program to reverse a string without using String
     * inbuilt function.
     */
    static String x = "Able was I ere I saw Elba";
    public static void main(String[] args) {
//        Negash.reverseString(x);
        Negash.reverseString1(x);
    }

    public static void reverseString(String str){
        int len = str.length();// 25
        String u="";
        while (len > 0){
            u = u + str.charAt(len-1);
            len--;
        }
        String cas = u.toLowerCase();
        System.out.println(u);
        System.out.println(cas);
    }

    public static void reverseString1(String str){
       // convert string to char array
        char[] ch = str.toCharArray();

        for (int i= ch.length-1;i>=0;i--){
            System.out.print(ch[i]);
        }
    }


}
