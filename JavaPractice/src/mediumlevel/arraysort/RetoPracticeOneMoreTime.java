package mediumlevel.arraysort;

import java.util.Arrays;

public class RetoPracticeOneMoreTime {
    // By using the bubble sort algorithm, write a Java program to sort an integer array of 10 elements in ascending.

    public static void main(String[] args) {
        int[] arr = {23, 7, 67, 2, 4, 9, 1, 8, 32, 67, 43};
        RetoPracticeOneMoreTime.bubbleSort(arr);

    }

    public static void bubbleSort(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
//                    array[j-1] = temp;
//                    temp = array[j];
//                    array[j] = array[j-1];
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.print("\n" + "After bubble sort: ");
        for (int k = 0; k < array.length; k++) {

            System.out.print(array[k] + " ");


        }
    }
}
