package popularjavainterviewquestions.iteratehashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Easha {

    public static void main(String[] args) {
        Easha.iterateHashMapUsingForEach();
//        Easha.iterateHashMapUsingWhileLoop();
//        Easha.anotherWayUsingLambda();
//        Easha.usingScanner();
    }

    public static void iterateHashMapUsingWhileLoop(){
        Map<Integer, String> countries = new HashMap<>();
        countries.put(1, "Sri Lanka");
        countries.put(2, "Nepal");
        countries.put(3, "Bangladesh");
        countries.put(4, "Mauritius");
        countries.put(5, "Japan");

        Iterator<Map.Entry<Integer,String>> allEntries = countries.entrySet().iterator();
        //Map.Entry represents ONE key-value pair in Hashmap
        while(allEntries.hasNext()){
            Map.Entry entry = allEntries.next();
            System.out.println(entry.getKey() + ". "+ entry.getValue());
        }
//        Iterator all = countries.entrySet().iterator();
//        //Map.Entry represents ONE key-value pair in Hashmap
//        while(allEntries.hasNext()){
//            Map.Entry entry = (Map.Entry)all.next();
//            System.out.println(entry.getKey() + ". "+ entry.getValue());
//        }

    }

    public static void iterateHashMapUsingForEach(){
        Map<Integer, String> fruits = new HashMap<>();
        fruits.put(1, "Orange");
        fruits.put(2, "Banana");
        fruits.put(3, "Kiwi");
        fruits.put(4, "Mango");
        fruits.put(5, "Pepper");
        fruits.put(6, "Apple");

        //to get keys only
        System.out.println("**********Keys Only***********");
        for(Integer myKeys: fruits.keySet()){
            System.out.println(myKeys);
        }

        //to get values only
        System.out.println("**********Values Only***********");
        for(String myValues: fruits.values()){
            System.out.println(myValues);
        }

        //to get both key and value
        System.out.println("**********Both Keys and Values***********");
        for(Map.Entry<Integer, String> getAll: fruits.entrySet()){
            System.out.println(getAll);

        }
        System.out.println("******OR******");

        for(Map.Entry<Integer, String> getAll: fruits.entrySet()){
            Integer myKeys = getAll.getKey();
            String myValues = getAll.getValue();
            System.out.println(myKeys + ") "+ myValues);
        }
    }
    public static void anotherWayUsingLambda(){
        Map<Integer, String> fruits = new HashMap<>();
        fruits.put(1, "Orange");
        fruits.put(2, "Banana");
        fruits.put(3, "Kiwi");
        fruits.put(4, "Mango");
        fruits.put(5, "Pepper");
        fruits.put(6, "Apple");

                            fruits.forEach((p, k)-> System.out.println(p+"."+k));
        System.out.println();
    }

    public static void usingScanner(){
        Scanner input = new Scanner(System.in);
      try {
          Map<Integer, String> favoritefood = new HashMap<>();
          System.out.println("Number and Favorite food");
          favoritefood.put(input.nextInt(), input.next());
          System.out.println("Second number and Favorite food");
          favoritefood.put(input.nextInt(), input.next());
          System.out.println("Last Number and Favorite food");
          favoritefood.put(input.nextInt(), input.next());

          favoritefood.forEach((p,k)-> System.out.println("Your favorite food is: "+ p + ") " + k));
      }catch(Exception e){
          System.out.println(e);
      }

        input.close();
    }
}
