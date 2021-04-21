package mediumlevel.lowestdifference;

public class Negash {
    /*
 Implement in java.
 Read this below two array. Find the lowest difference between the two array cell.
 The lowest difference between cells is 1
*/
    static int [] array1 = {30,12,5,9,2,20,33,1};
    static int [] array2 = {18,25,41,47,17,36,14,19};

    public static void main(String[] args) {
        Negash.findTheLowest(array1,array2);
    }

    public static void findTheLowest(int[] arrayA, int[] arrayB){
        int lowest = Integer.MAX_VALUE;
        for (int i = 0;i < arrayA.length;i++) {  // walking throughout first arrayA
            for (int j = 0;j< arrayB.length;j++){ // walking throughout second arrayB
                int difference = Math.abs(arrayA[i]- arrayB[j]); // putting the difference in absolute to get the positive difference
                if(difference < lowest){ // if the difference is less than the lowest
                    lowest= difference;  // reset the value of the lowest
                }
            }
        }
        System.out.println(lowest);
    }
}
