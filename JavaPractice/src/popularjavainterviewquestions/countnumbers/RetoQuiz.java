package popularjavainterviewquestions.countnumbers;

import java.util.HashMap;
import java.util.Map;

public class RetoQuiz {
    /**
     *  Write a Java Program to count the number of words in a string using HashMap.
     */

    public static void main(String[] args) {
      String sentence = "I hate that I memorize things so it makes it harder for me to know if I understood it";
      RetoQuiz.countNumbers(sentence);
    }

    public static void countNumbers(String sentence){
        Map<String, Integer> map = new HashMap<>();
        String[] split = sentence.split(" ");
        for(int i = 0; i<split.length; i++){
            if(map.containsKey(split[i])){
                int count = map.get(split[i]);
                map.put(split[i],count+1);
            }else{
                map.put(split[i],1 );
            }
        }
        for(Map.Entry<String, Integer> m : map.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
