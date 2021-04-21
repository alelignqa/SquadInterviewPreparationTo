package mediumlevel.merge;

import java.util.*;

public class Negash {
//     Merge Two Arrays Into Single Sorted Array Without Duplicates
//     given  arrayA={1,3,4}
//     given  arrayB={4,5,6,7,8}
//     output {1,3,4,5,6,7,8}

    static Integer[]  arrayA = {1,3,4};
    static Integer[]  arrayB = {4,5,6,7,8};

    public static void main(String[] args){
        mergeArrays();
        Negash.mergeArrays1(Negash.arrayA,Negash.arrayB);
    }

    public static void mergeArrays(){
        int[]  arrayA = {1,3,4};

        int[]  arrayB = {4,5,6,7,8};
        Integer[]  arrayD = {4,5,6,7,8,9};

        Set<Integer> newArrayA = new TreeSet<>();
        Set<Integer> newArrayB = new TreeSet<>();
        Set<Integer> newArrayD = new TreeSet<>();

        newArrayA.addAll(Arrays.asList(new Integer[]{1,3,4}));
        newArrayB.addAll(Arrays.asList(new Integer[]{4,5,6,7,8}));
        newArrayD.addAll(Arrays.asList(arrayD));

        newArrayA.addAll(newArrayB);
        System.out.println(newArrayA);
        newArrayD.addAll(newArrayA);
        System.out.println(newArrayD);

    }

    public static void mergeArrays1(Integer[] a, Integer[] b){

        Set<Integer> newArrayA = new TreeSet<>();
        Set<Integer> newArrayB = new TreeSet<>();

        newArrayA.addAll(Arrays.asList(a));

        newArrayB.addAll(Arrays.asList(b));

        newArrayA.addAll(newArrayB);
        System.out.println(newArrayA);

    }

}
