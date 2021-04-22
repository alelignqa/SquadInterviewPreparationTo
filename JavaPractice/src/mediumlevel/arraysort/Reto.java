package mediumlevel.arraysort;

import java.util.Arrays;

public class Reto {
    // By using the bubble sort algorithm, write a Java program to sort an integer array of 10 elements in ascending.

    public static void main(String[] args) {
        int[] bubble = {11, 34, 67, 1, 4, 63, 49, 5, 23, 98};
        Reto.bubbleSortAlgorithm(bubble);
//        Reto.bubbleSort1();
//        Reto.bubbleSortAlgorithmYouTube(bubble);
    }

    public static void bubbleSortAlgorithm(int[] array){
        int[] bubble = {11, 34, 67, 1, 4, 63, 49, 5, 23, 98};
        int temp = 0;
        for(int i = 0; i< array.length; i++){
            for(int j = 1; j< array.length-i; j++){
                if(array[j-1]>array[j]){
                     temp =array[j-1];
                    array[j-1] = array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.print("\n"+"After bubble sort: ");
        for (int k = 0; k < array.length; k++) {

            System.out.print(array[k] + " ");
        }
    }

    public static void bubbleSortAlgorithmYouTube(int[] array){
        int temp = 0;
        for(int i = 0; i< array.length-1; i++){
            for(int j = 0; j< array.length-1-i; j++){
                if(array[j]<array[j+1]){
                     temp =array[j];
                    array[j] = array[j+1];
                    array[j+1]=temp;
                }
            }
            System.out.print("\n"+"After bubble sort: ");
            for (int k = 0; k < array.length; k++) {

                System.out.print(array[k] + " ");
            }
        }
    }



//    public static void bubbleSort1() {
//        int[] bubble = {11, 34, 67, 1, 4, 63, 49, 5, 23, 98};
//        int temp = 0; // temp = 11
//        for (int i = 0; i < bubble.length; i++) { //i = 11
//            for (int j = 1; j < bubble.length - i; j++) {
//                if (bubble[j - 1] > bubble[j]) {
//                    temp = bubble[j - 1];
//                    bubble[j - 1] = bubble[j];
//                    bubble[j] = temp;
//                }
//            }
//        }
//        System.out.print("\n"+"After bubble sort: ");
//        for (int k = 0; k < bubble.length; k++) {
//
//            System.out.print(bubble[k] + " ");
//            }
//        }





//    public static void bubbleSort(){
//        int [] bubble ={11, 34, 67, 1, 4, 63, 49, 5, 23, 98};
//        int temp =0; // temp = 11
//        for(int i = 0; i< bubble.length; i++) { //i = 11
//            for (int j = 1; j < bubble.length-1; j++) {
//                temp = bubble[i];
//                if(j>i){ //34>11
//                    i = j;//j = 11
//                    j=temp;
//                    System.out.println(temp);
//
//                    //                    j = temp;// 11 = temp
////                    temp = j;
//                    //System.out.println(temp);
////                }else if(i>j){
////                    j = temp;
////                    System.out.println(temp);
//                }
//
//                }
//
//            }
////            System.out.println(Arrays.toString(bubble));
//
//        }
    }

