package mediumlevel.lowestdifference;

import java.util.Arrays;

public class RetoCheat {
    /*
     Implement in java.
     Read this below two array. Find the lowest difference between the two array cell.
     The lowest difference between cells is 1
    */
    public static void main(String[] args) {


        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};

        RetoCheat.lowestDifference(array1,array2);
    }

    public static void lowestDifference(int[] array1, int[] array2){
        int i;
        int j = 0;
        int temp;

        for(i = 0; i<array1.length; i++ ){
            if(array1[i]<array2[j]){
                temp = array1[i];
            }else{
                 temp = array2[j];
            }
            i++;
            System.out.println(temp);
        }

    }

    public static int lowestDifference1(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int minimum = Integer.MAX_VALUE;// difference is the max num u can get in the integer value
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                int difference = Math.abs(arr1[i] - arr2[j]);
                if (difference < minimum) {
                    minimum = difference;
                }
            }
        }
        System.out.println("The lowest difference bewtween the 2 array is " + minimum);
        return minimum;
    }

    public static int lowestDifference2(int[] arr1, int[] arr2) {
        // int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        //int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};
        Arrays.sort(arr1); // int[] array1 ={ 1 , 2, 5, 9, 12, 20, 30, 33}
        Arrays.sort(arr2);// int[] array2 = {14, 17, 18, 19, 25, 36, 41, 47}
        int minimum = 100;// difference is the max num u can get in the integer value
        for (int i = 0; i < arr1.length; i++) { //0<8;
            for (int j = 0; j < arr2.length; j++) {
                int difference = Math.abs(arr1[i] - arr2[j]);
                if (difference < minimum) {
                    minimum = difference;
                }
            }
        }
        System.out.println("The lowest difference bewtween the 2 array is " + minimum);
        return minimum;
    }
}
