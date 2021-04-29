package popularjavainterviewquestions.countnumbers;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EashaQuiz {


    public static void main(String[] args) {

        EashaQuiz.countWordsInSentence();

    }
    public static void countWordsInSentence(){
        /*
        declare hashmap
        declare scanner: get sentence
        split sentence in words
        retrieve all data from sentence
                    - if the word already exist add +1 to the value of existing word
                    -if word is new, value is 1

         */

        HashMap<String, Integer> countWords = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Please type a sentence for me to count for you: ");

        String sentence = scan.nextLine();
        String words[] = sentence.split(" ");

        for(String word: words){
            if(countWords.containsKey(word)){
                countWords.put(word.toLowerCase(),countWords.get(word)+1);
            }else{
                countWords.put(word,1);
            }
        }


        System.out.println(countWords);
        scan.close();
    }
}
