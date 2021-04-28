package popularjavainterviewquestions.iteratearraylist;

import org.apache.commons.collections4.iterators.ArrayIterator;
import org.apache.commons.collections4.iterators.ArrayListIterator;

import java.util.*;

public class Negash {
    //Write a Java Program to iterate ArrayList using for-loop, while-loop, and advance for-loop.
    List<Integer> array = new ArrayList<Integer>(Arrays.asList(new Integer[]{12, 15, 89, 36, 47, 89, 50, 42, 58}));


    public static void main(String[] args) {
//        Negash.iterate();
        Negash.looping(array());

    }

    public static void iterate() {
        int[] num = {12, 15, 89, 36, 47, 89, 50, 42, 58};

        System.out.println("~~~~~~For Loop~~~~~~~");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + "\t");
        }
        System.out.println("\n~~~~~~For Each~~~~~~~");
        for (int newNum : num) {
            System.out.print(newNum + "\t");
        }
        System.out.println("\n~~~~~~While Loop reverse~~~~~~~");
        int n = num.length - 1;
        while (n >= 0) {
            System.out.print(num[n] + "\t");
            n--;
        }
        System.out.println("\n~~~~~~While Loop ~~~~~~~");
        int m = 0;
        while (num.length > m) {
            System.out.print(num[m] + "\t");
            m++;
        }
    }

    public static ArrayList<String> array() {
        ArrayList<String> arry = new ArrayList<>();
        arry.add("Burger");
        arry.add("Pizza");
        arry.add("Pasta");
        arry.add("Salad");
        arry.add("Burrito");
        arry.add("Sandwich");
        arry.add("Coffee");
        arry.add("Beverage");
        return arry;
    }

    public static void looping(ArrayList arrayName) {

        int len = arrayName.size();
        System.out.println("~~~~~Using a For Loop~~~~~~~~~~");
        for (int i = 0; i < len; i++) {
            System.out.print(arrayName.get(i) + " \t");
        }

        System.out.println("\n\n~~~~~Using a For Each~~~~~~~~~~");
        for (Object list : arrayName) {
            System.out.print(list + " \t");
        }

        System.out.println("\n\n~~~~~Using a While Loop~~~~~~~~~~");
        int m = 0;
        while (len - 1 >= m) {
            System.out.print(arrayName.get(m++) + " \t");
        }

        System.out.println("\n\n~~~~~Using a Iterator~~~~~~~~~~");
        // since we have array List ListIterator will be a best choice - but we can also use Iterator
        ListIterator<String> iterator = arrayName.listIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " \t");
        }

        System.out.println();
        Iterator iteratorA = arrayName.iterator();
        while (iteratorA.hasNext()) {
            System.out.print(iteratorA.next() + " \t");
        }

        System.out.println("\n~~~~Using Enumerator of Vector class ~~~");
        Vector ve = new Vector(arrayName);
        Enumeration enu = ve.elements();
        while (enu.hasMoreElements()) {
            System.out.print(enu.nextElement() + " \t");
        }

    }

}
