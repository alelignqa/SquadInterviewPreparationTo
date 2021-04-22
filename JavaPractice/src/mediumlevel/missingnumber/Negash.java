package mediumlevel.missingnumber;

import java.util.Arrays;

public class Negash {

    /*
     * If n = 10, then array will have 9 elements in the range from 1 to 10.
     * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
     * Write java code to find the missing number from the array. Write static helper method to find it.
     */
    static int [] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};

    /*  the concept of find a missing number from an array element
        Given the missing number is not the largest value
        And it is an array of consecutive number elements
        aa. first get the sum of all the array elements actually exist
        bb. get what would be if all the element had been in the list
            we need to find the largest number and use this formula
            n*(n+1)/2
        cc. subtract the expected which is bb - the actual whic is aa

     */
    public static void main(String[] args) {
        findMissing(Negash.array,10);
        int expectedSum = 10 * (10 + 1)/2;
        System.out.println(expectedSum);
        System.out.println(findSumOfArrayElements(Negash.array));
    }

    public static int findSumOfArrayElements(int[] arrayName){
        int sum = 0; // to hold the sum value
        for (int add: arrayName){
            sum += add;
        }
        return sum;
    }

    public static void findMissing(int[] arrayName,int biggestNum){
        // 1,2,3,...., n => n*(n+1)/2  1,2,3,4 = array length  55
        int expectedSum = biggestNum * (biggestNum + 1)/2; // if all elements are preset 1+2+3+...+biggestNum
        int actualSum = findSumOfArrayElements(arrayName); // sum of actually avail in the array
        int missingNum = expectedSum - actualSum;
        System.out.println(missingNum);

    }

}
