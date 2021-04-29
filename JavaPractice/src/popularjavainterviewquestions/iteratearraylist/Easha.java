package popularjavainterviewquestions.iteratearraylist;

import java.util.ArrayList;

public class Easha {
    //Write a Java Program to iterate ArrayList using for-loop, while-loop, and advance for-loop.


    public static void main(String[] args) {

        Easha.arraylistIterateUsingForEach();
        Easha.arraylistIterateUsingForLoop();
    }

    //for each
    public static void arraylistIterateUsingForEach(){
        ArrayList<String> countries = new ArrayList();
        countries.add("Bangladesh");
        countries.add("USA");
        countries.add("Maldives");
        countries.add("Sri Lanka");
        countries.add("Austria");
        countries.add("Bolvia");


        for(String cname: countries){
            System.out.println(cname);
        }
    }
    public static void arraylistIterateUsingForLoop(){
        ArrayList <Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        for(int i =0; i < numbers.size(); i++){
            System.out.println(numbers.get(i));
        }

    }

    public static void arrayListIterateUsingWhileLoop(){
        ArrayList <String> friends = new ArrayList<>();
        friends.add("Reto");
        friends.add("Negash");
        friends.add("Simar");


        int myindex =0;
        while(friends.size() > myindex){
            System.out.println(friends.get(myindex));

        }
    }
}

