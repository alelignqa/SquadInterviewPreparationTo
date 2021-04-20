package mediumlevel.missingnumber;

public class Easha {

    static int [] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};

    public static void main(String[] args) {

        Easha.findMissing(array,10);
    }
    public static int actualSum(int[] array){
        int sum = 0;
        for(int add: array){
            sum+= add;
        }
        return sum;
    }

    public static void findMissing(int[] array, int bigNum){
        int expectedSum = bigNum * (bigNum+1)/2;
        int actualSum = actualSum(array);
        int missingNum = expectedSum - actualSum;
        System.out.println(missingNum);
    }
}
