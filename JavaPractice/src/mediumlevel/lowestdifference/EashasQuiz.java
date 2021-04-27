package mediumlevel.lowestdifference;

import java.util.Arrays;

public class EashasQuiz {

    public static void main(String[] args) {
         /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int [] array1 = {30,12,5,9,2,20,33,1};
        int [] array2 = {18,25,41,47,17,36,14,19};

       findLowest(array1,array2);
    }

    public static void findLowest(int [] array1, int [] array2) {
        Arrays.sort(array1);
        Arrays.sort(array2);



        int storeDiff = Integer.MAX_VALUE;//max diff
        int i;
        int j;
        int diff;

                for(i = 0; i < array1.length; i++){
                    for(j =0; j <array2.length; j++){
                         diff = Math.abs(array1[i] - array2[j]);//min
                        if(storeDiff > diff){
                            storeDiff = diff;
                        }

                    }

                }
        System.out.println(storeDiff);

    }

}
