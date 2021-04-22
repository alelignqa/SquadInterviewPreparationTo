package mediumlevel.searchelement;

public class Easha {

    public static void main(String[] args) {
        int [] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Easha.searchStupidElement(myArray, 4);
    }

    public static void searchStupidElement(int[] myArray, int num){
        for(int i = 0; i < myArray.length; i++){
            if(myArray[i] == num){
                System.out.println(num + " is at index  " + i);
            }
        }
    }
}
