package popularjavainterviewquestions.reversestring;

public class Easha {
    /**
     * Write a Java Program to reverse a string without using String
     * inbuilt function.
     */
    static final String name = "Easha";

    public static void main(String[] args) {


        Easha.reverseString(name);

        //using in built methods
        String reverse = new StringBuilder(name).reverse().toString();
        System.out.print(reverse);
    }

    public static void reverseString(String name) {

        String reverse = "";

        for (int i = name.length()-1; i >= 0; i--) { // i will be length of string -1 so it will go to the end i = 4
            reverse += name.charAt(i);// b will be holding our value at i each time so right now at 4 it is
            // 'i'
            //it will continue to hold it inside reverse until length is done
        }
        System.out.println(reverse);

//        System.out.println(name.length());
//        System.out.println(name.charAt(0));
    }

}
