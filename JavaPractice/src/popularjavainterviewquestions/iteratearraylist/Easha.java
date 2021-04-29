package popularjavainterviewquestions.iteratearraylist;

import java.util.ArrayList;

public class Easha {
    //Write a Java Program to iterate ArrayList using for-loop, while-loop, and advance for-loop.


    public static void main(String[] args) {

//        Easha.arraylistIterateUsingForEach();
//        Easha.arraylistIterateUsingForLoop();
        Easha.arrayListIterateUsingWhileLoop();
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
                myindex++;
        }
    }

    public static void practice(){
        ArrayList<String> mylist = new ArrayList<>();
        mylist.add("Pineapple");
        mylist.add("Apple");
        mylist.add("Gorilla");
        mylist.add("Monkey");

        int index = 0;
        while(mylist.size() > index){
            System.out.println(mylist.get(index));
            index++;
        }

//        for(String list: mylist){
//            System.out.println(list);
//        }
//
//        for(int i = 0; i < mylist.size(); i++ ){
//            System.out.println(mylist.get(i));
//        }
    }
}

