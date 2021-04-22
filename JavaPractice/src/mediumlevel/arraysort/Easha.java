package mediumlevel.arraysort;

public class Easha {
    // By using the bubble sort algorithm, write a Java program to sort an integer array of 10 elements in ascending.


    public static void main(String[] args) {

    }

    public static void arraySort(){
        int [] myArray = {5, 10, 2, 44, 22, 12, 87, 3,1, 90};
        int length = myArray.length;
        int temp=0;
        for(int i = 0; i < length; i++){
            for(int j =1; j < length - i; i++ ){
                if(myArray[j] < myArray[j-1]){// if 10 < 5
                    temp = myArray[j-1];//then  store 5 in temp
                    myArray[j-1] = myArray[j];// now that myArray[j -1] is empty we are storing myArray[j] which is 5
                    // where 10 use to be
                    myArray[j] = temp;//then we are making 10 is temp
                }
            }
        }
    }
}
