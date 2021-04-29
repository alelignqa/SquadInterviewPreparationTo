package popularjavainterviewquestions.countnumbers;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Negash {
    /**
     * I am not I am and you are not you as long as you don't know me and I don't know you
     * Write a Java Program to count the number of words in a string using HashMap.
     */
    static String word = "I know what I know but if I tel it as I know I know I won't be here now ";

    public static void main(String[] args) {
//        Negash.wordCount(word);
//        String n = "AllInOne";
//        Negash.wordCount(n);
        Negash.wordCount1();

    }

    public static void wordCount(String word) {

        HashMap<String, Integer> str = new HashMap<>(); // as per the request of the Q declare HashMap
        String[] wrd = word.split(" "); // split the sentence per space - assumption words are separated by space

        int count = wrd.length; // this is if we received a word in steady of a sentence
        if (count > 1) {        // condition expecting more than a word
            for (String list : wrd) { // condition is true loop through the array
                String newWord = list.toLowerCase(); // converting all to lowercase
                if (str.containsKey(newWord)) {  // checking whether we have the element in the hash map
//                    int c = str.get(nWord);
//                    str.put(nWord, c + 1);
                    str.put(newWord, str.get(newWord) + 1); // if we have the word add and add it's count +1
                } else
                    str.put(newWord, 1); // new word add and count as one
            }
        } else
            str.put(word, 1);// if we end up having only one word count it as is
        System.out.println(str);
    }

    public static void wordCount1() {
        HashMap<String, Integer> str = new HashMap<>(); // as per the request of the Q declare HashMap

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the sentence you want me to count their words ");
        String word = in.nextLine();

        String[] wrd = word.split(" "); // split the sentence per space - assumption words are separated by space
        System.out.println(word);
        int count = wrd.length; // this is if we received a word in steady of a sentence
        if (count > 1) {        // condition expecting more than a word
            for (String list : wrd) { // condition is true loop through the array
                String newWord = list.toLowerCase(); // converting all to lowercase
                if (str.containsKey(newWord)) {  // checking whether we have the element in the hash map
                    int c = str.get(newWord);
                    str.put(newWord, c + 1);
//                    str.put(nWord, str.get(nWord) + 1); // if we have the word add and add it's count +1
                } else
                    str.put(newWord, 1); // new word add and count as one
            }
        } else
            str.put(word, 1);// if we end up having only one word count it as is
        System.out.println(str);
        in.close();

        // not sure
//        Set<String> keys = str.keySet(); // list of unique words because it's a Set
//
//        TreeSet<String> sortedKeys = new TreeSet<>(keys); // ascending order of words
//
//        for (String st : sortedKeys) {
////            System.out.println("Word =" + str + " and it's count = " + str.get(str));
//        }
//        System.out.println("Word =" + str + " and it's count = " + str.get(str));
    }


}
