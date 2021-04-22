package mediumlevel.missingnumber;

public class Easha {

    static int [] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};

    public static void main(String[] args) {

        Easha.findMissing(array,10);// pass the array and the laregst number of the array
    }
    public static int actualSum(int[] array){
        int sum = 0; //
        for(int add: array){ // to get actual sum if all numbers were present using for each loop
            sum+= add; // now add all the numbers together
        }
        return sum;
    }

    public static void findMissing(int[] array, int bigNum){
        int expectedSum = bigNum * (bigNum+1)/2; // using n * (n+1)/2; using the largest number of the array
        int actualSum = actualSum(array);// store actual sum using previous method
        int missingNum = expectedSum - actualSum;// substract expected from actual
        System.out.println(missingNum);// print it
    }
}
