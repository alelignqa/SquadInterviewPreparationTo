package mediumlevel.arraysort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Negash {
    // By using the bubble sort algorithm, write a Java program to sort an integer array of 10 elements in ascending.
    // int [] array2 = {18,25,50,41,17,36,14,19,5,2};
    static int[] array2 = {18, 25, 50, 41, 17, 36, 14, 19, 5, 2}; //10
    static int[] array = { 12, 13, 24, 10, 3, 6, 90, 70 };


    public static void main(String[] args) {
        Negash.bubble(array2);
//        System.out.println();
//        System.out.println(Negash.bubble1(array2));
//        Negash.bubble2(array2);
//        System.out.println();
//        Negash.bubble2(array);
//        System.out.println(array2.length);


    }

    public static void bubble(int[] arrayName) {
        int len = arrayName.length; // getting the length of the array for simplicity
        for (int i = 0; i < len ; i++) { // first loop since array index is from 0 [length -1]

            for (int j = 0; j < len - i-1; j++) { // second loop will go up to -i [sorted and unsorted ]

        // {18, 25, 50, 41, 17, 36, 14, 19, 5, 2}  50  j < length[i-1]

                if (arrayName[j] > arrayName[j + 1]) { // compare consecutive array elements if i > i+1
                    int temp = arrayName[j];       // swap them if not return back to j loop
                    arrayName[j] = arrayName[j + 1];
                    arrayName[j + 1] = temp;
                }
            }
        }
//        System.out.println(array2.toString());
        for (int a : arrayName) {
            System.out.print(a + ",");
        }

    }

    public static List<Integer> bubble1(int[] arrayName) {
        List<Integer> sort = new ArrayList<>();
        int len = arrayName.length; // getting the length of the array for simplicity
        for (int i = 0; i < len - 1; i++) { // first loop since array index is from 0 [length -1]
            for (int j = 0; j < len - i - 1; j++) { // second loop will go up to -i [sorted and unsorted ]

                if (arrayName[j] > arrayName[j + 1]) { // compare consecutive array elements if i > i+1
                    int temp = arrayName[j];       // swap them if not return back to j loop
                    arrayName[j] = arrayName[j + 1];
                    arrayName[j + 1] = temp;
                }
            }
        }
//        System.out.println(array2.toString());
        for (int a : arrayName) {
            sort.add(a);
        }
        return sort;
    }

    public static void bubble2(int[] arrayName){
        int i,j,temp;
        boolean swap;
        int len = arrayName.length; // getting the length of the array for simplicity
        for (i = 0; i < len - 1; i++) { // first loop since array index is from 0 [length -1]
            swap = false;
            for (j = 0; j < len - i - 1; j++) { // second loop will go up to -i [sorted and unsorted ]

                if (arrayName[j] > arrayName[j + 1]) { // compare consecutive array elements if i > i+1
                    temp = arrayName[j];       // swap them if not return back to j loop
                    arrayName[j] = arrayName[j + 1];
                    arrayName[j + 1] = temp;
                    swap=true;
                }
            }
            if(swap == false){
                break;
            }
        }
//        System.out.println(array2.toString());
        for (int a : arrayName) {
            System.out.print(a + ",");
        }
    }


}
