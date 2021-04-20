package mediumlevel.merge;

import java.lang.reflect.Array;
import java.util.*;

public class Reto {
    // Merge Two Arrays Into Single Sorted Array Without Duplicates
    // given  arrayA={1,3,4}
    // given  arrayB={4,5,6,7,8}
    // output {1,3,4,5,6,7,8}

    public static void main(String[] args) {
        int[] arrayA = {1,3,4};
        int[] arrayB ={4,5,6,7,8};

        Reto.mergeAndRemoveDuplicatesInTwoArrays(arrayA,arrayB);
    }

    public static int[] mergeAndRemoveDuplicatesInTwoArrays(int[] array1, int[] array2) {
        //int[] arrayA = {1,3,4};
        //int[] arrayB ={4,5,6,7,8};

        int num1 = array1.length;
        int num2 = array2.length;
        int[] mergeArray = new int[num1 + num2]; // the resultant array
        int i = 0; // variable "i" will trace array 1
        int j = 0; // variable "j' will trace array 2
        int k = 0;
        while (i < num1 && j < num2) {// 'i' will go up to the size of array1, and j will go up to the size of array2
            if (array1[i] < array2[j]) {//if array1 at 'i' index is less than array2 at 'j' index
                mergeArray[k] = array1[i];// element which is less( array1 at 'i' index) will be placed in the merge array
                i++; // keep incrementing until array1 at 'i' index is no longer less than array2 at 'j' index
                k++; // k will increment each time as well to place the element each time the above condition is true
            } else {
                // in our example, it will loop in the above condition twice because
                // 1<4--> true, 3<4--> true, 4<4--> false so it will break out of the loop and come to the else condition
                //the reason we r comparing each value of array1 to the '0' index of array2 in the above condition because we are not incrementing j and because we have j initialized to 0

                mergeArray[k] = array2[j]; //so because the condition failed at 4<4--> we break out of the first condition, and now place the array at 'j' index in our merged array
                j++;// j is incremented so j is '5' now and it will go back to the first condition and check if 4<5--> true,
                k++;
            }
        }

        // so the size of array1 is less then size of array2 so when it goes to the 4th index of array1 the while loop condition fails
        //because when we see that 4<5 and we want increment 'i' as the condition states
        //but we cant because there are no more elements in array1 to compare to array2
        while (i < num1) {// so this will fail , 'i' is now 4<3 --> false
            mergeArray[k] = array1[i];
            k++;
            i++;
        }
        while (j < num2) {// 4<5 --> true
            mergeArray[k] = array2[j];
            k++;
            j++;
        }

        // this is avoid duplicates
        //Set implementations in Java has only unique elements.
        // Therefore, it can be used to remove duplicate elements.
        Set<Integer> noduplicates = new HashSet<>();
        // loop through the merge array and add elements which are not duplicates in our hashset
        for(int x = 0; x<mergeArray.length; x++){
            noduplicates.add(mergeArray[x]);
        }
        //then we want tp add the elements from our hashset to an new merge array
        Iterator<Integer> iterate = noduplicates.iterator();
        int[] mergeArrayNoDuplicates = new int[noduplicates.size()];// declaring the new array the same size as our hashset
        int y = 0;
        while(iterate.hasNext()){// so iterate through our hashset and add each value from index 0 to our new merge array
            mergeArrayNoDuplicates[y] = iterate.next();// iterate.next() is place the element in our merge array if there is a next value in the hashset
            y++;// increment until there are no values left in our hashset
        }
        Arrays.sort(mergeArrayNoDuplicates);// this will sort our new merge array
        System.out.println("The merged Array : "+ Arrays.toString(mergeArrayNoDuplicates));
        return mergeArrayNoDuplicates;
    }






    //wrong attempt

//    public static void merge(int[] array1, int[] array2) {
//        int array1Length = array1.length;
//        int array2Length = array2.length;
//        int[] mergeArray = new int[array1Length + array2Length];
//
//        Set<Integer> noduplicates = new HashSet<>();
//        for(int x = 0; x<mergeArray.length; x++){
//            noduplicates.add(mergeArray[x]);
//        }
//
////        Set<Integer> arr1 = new TreeSet<>();
////        Set<Integer> arr2 = new TreeSet<>();
////
////        arr1.addAll(Arrays.asList(ar));
//
//        Arrays.sort(mergeArray);
//        System.out.println("The merged Array : "+ Arrays.toString(mergeArray));
//
//    }
}
