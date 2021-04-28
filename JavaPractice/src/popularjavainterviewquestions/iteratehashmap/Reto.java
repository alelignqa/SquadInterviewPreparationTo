package popularjavainterviewquestions.iteratehashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Reto {

    /**
     * Write a Java Program to iterate HashMap using While and advance for loop
     */

    public static void main(String[] args) {
        Reto.iterateHashMap();
    }

    public static void iterateHashMap() {
        RetosChildrenClass children1 = new RetosChildrenClass("Ruqaya", 7, true, 'L', "Samosa", 345789, "Space Engineer");
        RetosChildrenClass children2 = new RetosChildrenClass("Rafee", 10, false, 'L', "Korean BBQ Chicken", 456789, "CEO");
        RetosChildrenClass children3 = new RetosChildrenClass("Monika", 5, true);
        RetosChildrenClass children4 = new RetosChildrenClass("Aysha", 4, false);
        RetosChildrenClass children5 = new RetosChildrenClass("Asiyah", 3, true);

        Map<Integer, RetosChildrenClass> map = new HashMap<>();
        map.put(1,children1);
        map.put(2,children2);
        map.put(3,children3);
        map.put(4,children4);
        map.put(5,children5);
        int howManyKids = map.size();

        for(Map.Entry<Integer, RetosChildrenClass> mappy : map.entrySet()){
           int key = mappy.getKey();
           RetosChildrenClass children = mappy.getValue();
            System.out.println(key + " : "+ children.name +" , "+ children.age+" , "+children.behave+" , "+children.shirtSize+" , "+
                    children.favoriteFood +" , "+children.salary+" , "+children.futurePosition);
        }

        Iterator<Map.Entry< Integer, RetosChildrenClass>> iterate = map.entrySet().iterator();
      while (iterate.hasNext()){
          Map.Entry<Integer, RetosChildrenClass> children = iterate.next();
          int key = children.getKey();
          RetosChildrenClass childrens = children.getValue();
          System.out.println(key + " : "+ childrens.name +" , "+ childrens.age+" , "+childrens.behave+" , "+childrens.shirtSize+" , "+
                  childrens.favoriteFood +" , "+childrens.salary+" , "+childrens.futurePosition);
//          System.out.println(children.getKey() + " " + children.getValue());
      }

//        int m = 0;
//        while (howManyKids> m){
//            System.out.println(m++);
//        }


    }
}
