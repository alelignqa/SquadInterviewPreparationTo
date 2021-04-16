package mediumlevel.lowestnumber;

public class Reto {
    //Write java solution to find the lowest number from this array.

    public static void main(String[] args) {
        int array[] = new int[]{211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123, 67, 5, 679, 54, 32, 65};

        Reto.lowestNumber(array);
    }

    public static void lowestNumber(int number[]) {
        int min = number[0];
        for (int i = 1; i < number.length; i++) {
            if (number[i] < min) {
                min = number[i];
            }
        }
        System.out.println(min);
    }

}




