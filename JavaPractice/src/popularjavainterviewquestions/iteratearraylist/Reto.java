package popularjavainterviewquestions.iteratearraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Reto {
    //Write a Java Program to iterate ArrayList using for-loop, while-loop, and advance for-loop.

    public static void main(String[] args) {
        Reto.iterateArraylist();
    }

    public static void iterateArraylist(){
        ArrayList<String> iftaaritems = new ArrayList<>();
        iftaaritems.add("Pizza");
        iftaaritems.add("Chicken Sandwich");
        iftaaritems.add("Garbanzo Salad");
        iftaaritems.add("Japache");
        iftaaritems.add(4,"Chola");
        iftaaritems.add(5,"Aloor Chop");
        iftaaritems.add(6,"Beguni");
        iftaaritems.add(7,"Samosa");

        int myPlate = iftaaritems.size();

        System.out.println("________________________ FOR LOOP_______________________________________________");

        for(int i = 0; i<myPlate; i++){
            System.out.println(iftaaritems.get(i));
        }
        System.out.println("__________________________ FOR EACH_____________________________________________");

        for(String iftar : iftaaritems){
            System.out.println(iftar);
        }

        System.out.println("____________________________ITERATING________________________________");

        Iterator<String> iterator = iftaaritems.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("________________________ WHILE LOOP______________________________________________");
        int m = 0;
        while(myPlate>m){
            System.out.println(iftaaritems.get(m++));
//            m++;
        }
    }
}
