package mediumlevel.merge;

import java.util.*;

public class Easha {
    // Merge Two Arrays Into Single Sorted Array Without Duplicates
    // given  arrayA={1,3,4}
    // given  arrayB={4,5,6,7,8}
    // output {1,3,4,5,6,7,8}

   static Integer[] arrayA = {1, 3, 4};
   static Integer[] arrayB = {4, 5, 6, 7, 8};
    public static void main(String [] args) throws Exception {

        Easha.actualSum(arrayA, arrayB);

    }


    public static void actualSum(Integer [] arrayA, Integer [] arrayB){
        Set array1 = new TreeSet();
        Set array2 = new TreeSet();

        array1.addAll(Arrays.asList((arrayA)));
        array2.addAll(Arrays.asList((arrayB)));
        array1.addAll(array2);
        System.out.println(array1);
    }

}
