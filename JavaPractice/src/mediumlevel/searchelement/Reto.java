package mediumlevel.searchelement;

public class Reto {
    // By using the sequential search algorithm,
    // write a Java program to search for an element of an integer array of 10 elements.


    public static void main(String[] args) {
        int[] array1 = { 34,44, 90, 1, 6, 9, 65, 24, 13, 35};
        Reto.search(array1, 90);
    }

    public static void search(int[] array, int element){
        for(int i = 0; i<array.length; i++){
            if ( array[i] == element) {
                System.out.println(element+" at index "+ i);
            }
        }

    }
}
