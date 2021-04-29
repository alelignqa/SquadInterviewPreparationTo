package popularjavainterviewquestions.countnumbers;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Easha {
    /**
     *  Write a Java Program to count the number of words in a string using HashMap.
     */

    public static void main(String[] args) {
        Easha.findCountInString();

    }

    public static void findCountInString(){
        String inputString = "Hey, java is the worst language of all time today so is it java so so no";

        //split
        String words[] = inputString.split(" ");

        //create hashmap
        Map<String, Integer> wordCount = new HashMap<String, Integer>();

        //to check each word in the array
        for(String word: words){
            // if word is present:
            if(wordCount.containsKey(word)){
                wordCount.put(word.toLowerCase(), wordCount.get(word)+1);
            }else{
                wordCount.put(word,1);
            }
        }

        //extracting all keys of map - wordCount
        Set<String>wordsInString = wordCount.keySet(); //keySet will return set

        //loop through all the words in wordCount:
        for(String word: wordsInString){
            if(wordCount.get(word) >= 1){
                System.out.println(word + " : "+ wordCount.get(word));
            }
        }
    }
}