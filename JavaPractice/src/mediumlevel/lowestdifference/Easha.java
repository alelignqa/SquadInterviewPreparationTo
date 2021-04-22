package mediumlevel.lowestdifference;

import java.util.Arrays;

public class Easha {

    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int [] array1 = {30,12,5,9,2,20,33,1};
        int [] array2 = {18,25,41,47,17,36,14,19};


        System.out.println(Easha.findLowestDiff(array1, array2));
    }

    public static int findLowestDiff(int [] array1, int [] array2){

        Arrays.sort(array1);//sort each array
        Arrays.sort(array2);

        int minDiff = Integer.MAX_VALUE; //store max value it can total in a variable

        int i;
        int j;
        for(i =0; i< array1.length; i++){//first loop for first array
            for(j =0; j < array2.length; j++){//second array
                int difference = Math.abs(array1[i] - array2[j]);//store in variable difference between two using
                // Math.abs for pos value
                if(difference < minDiff){//if the difference is less than minimum difference
                    minDiff = difference;//then it will equal that
                }
            }
        }
        return minDiff;


    }


}
