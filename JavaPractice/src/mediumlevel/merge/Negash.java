package mediumlevel.merge;

import java.util.*;

public class Negash {
    // Merge Two Arrays Into Single Sorted Array Without Duplicates
    // given  arrayA={1,3,4}
    // given  arrayB={4,5,6,7,8}
    // output {1,3,4,5,6,7,8}

    static int[]  arrayA = {1,3,4};
    static int[]  arrayB = {4,5,6,7,8};

    public static void main(String[] args){
//        mergeArrays();
        mergeArrays1();
    }

    public static void mergeArrays(){
        int[]  arrayA = {1,3,4};
        int[]  arrayB = {4,5,6,7,8};

        Set<Integer> newArrayA = new TreeSet<>();
        Set<Integer> newArrayB = new TreeSet<>();

        newArrayA.addAll(Arrays.asList(new Integer[]{1,3,4}));
        newArrayB.addAll(Arrays.asList(new Integer[]{4,5,6,7,8}));

        newArrayA.addAll(newArrayB);
        System.out.println(newArrayA);

    }

    public static void mergeArrays1(){

        Set<Integer> newArrayA = new TreeSet<>();
        Set<Integer> newArrayB = new TreeSet<>();

        newArrayA.addAll(Arrays.asList(new Integer[]{1,3,4}));

        newArrayB.addAll(Arrays.asList(new Integer[]{4,5,6,7,8}));

        newArrayA.addAll(newArrayB);
        System.out.println(newArrayA);

    }

}
