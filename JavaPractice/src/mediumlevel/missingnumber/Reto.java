package mediumlevel.missingnumber;

public class Reto {

    /*
     * If n = 10, then array will have 9 elements in the range from 1 to 10.
     * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
     * Write java code to find the missing number from the array. Write static helper method to find it.
     */


    public static void main(String[] args) {
        int[] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
        Reto.missingShobMissing(array);
    }

    public static void missingShobMissing(int[] array1) {
        //1 number is missing so it will be the given array length plus one since
        //we have to consider the number that's missing
        //example: array length is 9 but 1 number is missing so the array length should be 10
        int n = array1.length + 1;
        int sum = (n * (n + 1)) / 2; // formula for sum of  n numbers -->55
        for (int i = 0; i < array1.length; i++) {
            //we have the sum of n numbers, no we have to subtract each element
            //of the array from the sum of our array
            //example our array has 1,2,4 --> sum = (4*(4+1))/2 = 10 --> 4 because we r missing 3 so total we shoudl have 4 elements
            //so to get the missing num, we have to subtract each index in our array from the sum to get the missing number
            sum -= array1[i];
            //55 = 55-10 -->45
            //45 = 45-2 -->43
            //43 = 43-1 --> 42
            //42 = 42-4 --> 38
            //38 = 38-5 --> 33
            //33 = 33-3 --> 30
            //30 = 30-7 --> 23
            //23 = 23-8 --> 15
            //15 = 15-6 --> 9
            //9 is the missing number
        }
        System.out.println("The missing number is: " + sum);
    }

    public static void missingNum(int[] array) {
        int sum1 = 0;
        // this will only add the num numbers in the given array
        for (int i = 0; i < array.length; i++) {
            sum1 += array[i];
        }
        //this will add the 1 to the length of the given array
        int sum2 = 0;
        for (int j = 1; j <= array.length + 1; j++) {
            sum2 += j;
        }
        int total = sum2 - sum1;
        System.out.println("The missing number in the array is " + total);
    }

    public static int findMissing(int arr[], int N) {
        int left = 0, right = N - 1;
        while (left <= right) {

            int mid = (left + right) / 2;

            // If the middle element is not on
            // the middle index, then the missing element is mid + 1.
            if (arr[mid] != mid + 1 && arr[mid - 1] == mid) {
                return mid + 1;
            }

            // This case means that the missing element is
            // not to the left. So search the right.
            if (arr[mid] == mid + 1)
                left = mid - 1;

                // This case means that the missing element is not
                // to the right. So search the left.
            else
                left = mid + 1;
        }

        // Will reach here if no missing element found.
        return -1;
    }

}

