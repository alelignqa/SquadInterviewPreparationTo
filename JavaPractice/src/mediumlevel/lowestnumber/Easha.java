package mediumlevel.lowestnumber;

public class Easha {
    /*
     * Write java solution to find the lowest number from this array.
     * Use one of the databases from mysql or mongodb to store and to retrieve.
     */


    //find lowest number from the array

    public static void main (String args[]){
        int  array[] = new int[]{1,211,110,99,34,67,89,67,456,321,3,456,78,90,45,32,56,78,90,54,32,123,67,5,679,54
                ,32,
                65};


        Easha.findLowestNum(array);

    }
    public static void findLowestNum(int array[]){

         int lowNum = array[6];// this is our spot holder;can pick any index in a variable

         for(int i =0;i<array.length; i++){// start at the beginning of the array
             if(array[i] < lowNum){ //if index of i[which we start at 0] is less than our spot holder
                 lowNum= array[i];//then make our spot holder that number
             }
         }
        System.out.println(lowNum);//print our spot holder

    }
}
