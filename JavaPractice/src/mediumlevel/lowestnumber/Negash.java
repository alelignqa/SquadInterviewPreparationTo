package mediumlevel.lowestnumber;

public class Negash {

    //find lowest number from the array
    static int array[] = new int[]{211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123, 67, 5, 679, 54, 32, 65};
    static int array1[] = new int[]{211, 110, 99, 3, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123, 67, 5, 679, 54, 32, 65};
    static int array2[] = new int[]{211, 110, 99, 3, 67, 89, 67, 456, 321, 0, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123, 67, 5, 679, 54, 32, 65};


    public static void main(String[] args) {
        Negash.findMinimum(Negash.array);
        Negash.findMinimum(Negash.array1);
        Negash.findMinimum(Negash.array2);
    }

    public static void findMinimum(int[] array) {
        int min = array[0];  // here I am holding the first element from the list
        for (int i = 1; i < array.length; i++) { // here entering to a loop start form second element to last
            if (min > array[i]) {  // here if the min I hold earlier is bigger than the element at new index i
                min = array[i];    // reset the value I hold earlier with the new smaller value
            }
        }
        System.out.println(min);
    }


}
