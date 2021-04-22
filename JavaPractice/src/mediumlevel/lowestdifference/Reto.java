package mediumlevel.lowestdifference;

import java.util.Arrays;

public class Reto {
    /*
       Implement in java.
       Read this below two array. Find the lowest difference between the two array cell.
       The lowest difference between cells is 1
      */
    public static void main(String[] args) {

        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};

        Reto.lowestDifference(array1,array2);
    }

    public static void lowestDifference(int[]array1, int[] array2){
        Arrays.sort(array1);// sorted array 1
        Arrays.sort(array2); //sorted array 2

        int minimum = Integer.MAX_VALUE; // declare minimum to be the largest value cause we need our minimum to be a value larger than our array so that we can compare
         for(int i = 0; i< array1.length; i++){
             for (int j = 0; j< array2.length; j++){
                 int difference = Math.abs(array1[i]-array2[j]); // so go through both the array and subtract the difference each time
                 //so it will subtract the element [i] from array2[0] then it will go back to the loop and do all of
                 if(difference<minimum){
                     minimum = difference;// reset the minimum
                 }
             }
         }
         System.out.println(" The lowest difference is: "+minimum);
    }
}
