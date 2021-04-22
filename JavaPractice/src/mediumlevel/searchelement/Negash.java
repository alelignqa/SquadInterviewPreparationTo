package mediumlevel.searchelement;

public class Negash {
    // By using the sequential search algorithm,
    // write a Java program to search for an element of an integer array of 10 elements.
    static int[] array = {20, 10, 14, 35, 69, 78, 5, 6, 80, 45};

    public static void main(String[] args) {
        Negash.search(array, 80);

    }

    public static void search(int[] arrayName, int num) {

        while (arrayName != null) {
            for (int i = 0; i < arrayName.length; i++) {
                if (arrayName[i] == num) {
                    System.out.println("The element is found at index " + i);
                }
            }
            break;
        }
    }
}
