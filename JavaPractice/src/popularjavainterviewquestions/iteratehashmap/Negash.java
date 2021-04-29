package popularjavainterviewquestions.iteratehashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Negash {
    /**
     * Write a Java Program to iterate HashMap using While and advance for loop
     */

    public static void main(String[] args) {
        Negash.iterate(hashMap());
    }

    public static HashMap<Integer, String> hashMap() {
        HashMap<Integer, String> items = new HashMap<>();
        items.put(1, "shoes");
        items.put(2, "purse");
        items.put(3, "Belt");
        items.put(4, "Shirt");
        items.put(5, "Pant");
        items.put(6, "T-shirt");
        return items;
    }

    public static void iterate(HashMap<Integer, String> hash) {
        System.out.println("~~~~~~~Using For Each~~~~~~~");
        for (Map.Entry<Integer, String> iter : hash.entrySet()) {
            System.out.print(iter.getKey() + " : " + iter.getValue() + "\t");
        }

        System.out.println("\n~~~~~~~Using For Each forEach(action) method to iterate map~~~~~~~");
        hash.forEach((k,v) -> System.out.print(k +" : " + v + "\t") );

        System.out.println("\n\n~~~~~~~Using For Each but separate Key  ~~~~~~~");

        for (Integer ord : hash.keySet()) {
            System.out.print("keys-" + ord + "\t");
        }
        System.out.println("\n\n~~~~~~~Using For Each but separate  Value ~~~~~~~");
        for (String item : hash.values()) {
            System.out.print("Values-" + item + "\t");
        }

        System.out.println("\n\n~~~~~~~Using Iterator  ~~~~~~~");
        Iterator<Map.Entry<Integer, String>> iter = hash.entrySet().iterator();

        while (iter.hasNext()) {
            Map.Entry list = iter.next();
            System.out.print(list.getKey() + " : " + list.getValue() + "\t");
        }

    }
}
