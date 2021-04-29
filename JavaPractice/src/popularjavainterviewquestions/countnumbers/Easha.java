package popularjavainterviewquestions.countnumbers;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Easha {
    /**
     * Write a Java Program to count the number of words in a string using HashMap.
     */

    public static void main(String[] args) {
//        Easha.findCountInString();
        Easha.wordCount();

    }

    public static void findCountInString() {
        //create hashmap
        Map<String, Integer> wordCount = new HashMap<String, Integer>();

        Scanner scan = new Scanner(System.in);
        System.out.println("Please type a sentence: ");

        String word = scan.nextLine();

        //split
        String words[] = word.split(" ");


        //to check each word in the array
        for (String thewords : words) {
            // if word is present add 1 to that count:
            if (wordCount.containsKey(thewords)) {
                wordCount.put(thewords.toLowerCase(), wordCount.get(thewords) + 1);
            } else {//otherwise just add 1
                wordCount.put(thewords, 1);
            }
        }

        System.out.println(wordCount);


//        //extracting all keys of map - wordCount
//        Set<String>wordsInString = wordCount.keySet(); //keySet will return set
//
//        //loop through all the words in wordCount:
//        for(String word: wordsInString){
//            if(wordCount.get(word) >= 1){
//                System.out.println(word + " : "+ wordCount.get(word));
//            }
//        }
        scan.close();
    }

    public static void wordCount() {
        /*
        declare hashmap
        declare scanner
        scan the next line
        split the sentence and put it in variable
        print all the elements using For each:
                            declare for each
                            if the word is already visible then add to value +1
                            else make it set value to 1
         */
        Map<String, Integer> countWords = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Write a sentence you wish to count: ");
        String sentence = scan.nextLine();

        String words []= sentence.split(" ");

        for(String word: words){
            if(countWords.containsKey(word)){
                countWords.put(word.toLowerCase(),countWords.get(word)+1);
            }else{
                countWords.put(word,1);
            }
        }
        System.out.println(countWords);

    }
}
