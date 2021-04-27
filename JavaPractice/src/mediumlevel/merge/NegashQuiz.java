package mediumlevel.merge;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class NegashQuiz {
    // given  arrayA={1,3,4}
    // given  arrayB={4,5,6,7,8}
    // output {1,3,4,5,6,7,8}  [1, 3, 4, 5, 6, 7, 8]

    static Integer[] arrayA = {1, 3, 4};
    static Integer[] arrayB = {4, 5, 6, 7, 8};

    public static void main(String[] args) {
        NegashQuiz.merge(arrayA,arrayB);
    }

    public static void merge(Integer[] arrayA, Integer[] arrayB){

        Set<Integer> a = new TreeSet<>();
        Set<Integer> b = new TreeSet<>();

        a.addAll(Arrays.asList(arrayA));
        b.addAll(Arrays.asList(arrayB));

        a.addAll(b);
        System.out.println(a);
    }
}
