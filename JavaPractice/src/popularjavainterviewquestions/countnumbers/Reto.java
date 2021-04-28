package popularjavainterviewquestions.countnumbers;

import java.util.HashMap;
import java.util.Map;

public class Reto {

    /**
     *  Write a Java Program to count the number of words in a string using HashMap.
     */

    public static void main(String[] args) {
        String sentence = "Java hurts my head so I dislike Java but on occasion I enjoy Java but its weird, its like a love hate relationship";
    //Reto.countNumOfWordsInStringWRONG(sentence);
        Reto.countNumOfWordsInSentence(sentence);
    }

    public static void countNumOfWordsInSentence(String sentence){
        Map<String, Integer> map = new HashMap<>();
        String[] split = sentence.split(" ");
                for(int i = 0; i< split.length; i++){
                    if(map.containsKey(split[i])){// so if we find the word, then continue the if statement
                        int count = map.get(split[i]);
                        map.put( split[i], count+1); // we already have the word, so if we find the word in our hashmap again, add 1
                    }else {
                        map.put(split[i], 1);// else if the word doesnt have a duplicate then leave it as 1
                    }
        }
                for(String mappy : map.keySet()){
                    System.out.println(mappy + " "+ map.get(mappy));
                }
            }
















// wrong attempt- counts each letter in a word
    public static void countNumOfWordsInStringWRONG(String sentence){
        String[] split = sentence.split(" ");
        HashMap<Integer, String> map = new HashMap<>();
        for(String word : split){
            map.put(word.length(),word);
        }

        int wordLength = 0;
        String word = " ";
        for(Map.Entry<Integer, String> length : map.entrySet()){
            wordLength = length.getKey();
            word = length.getValue();
            System.out.println(wordLength + " "+word);

        }




    }
}
