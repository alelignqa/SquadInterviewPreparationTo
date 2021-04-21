package mediumlevel.pattern;

public class Easha {

    public static void main (String args []){
        /* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
         * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
         *
         *
         */

        Easha.pattern();
    }

    public static int  pattern(){
        int i = 0;
        for( i = 100; i >= 0; i--){// since the pattern starts at 100 and counts down, we will initialize at 100
            System.out.print(i+",");// to seperate each number with a comma as it prints
            if(i <=90){// if i is less than or equal to 90 decrease i
                i--;
            }
            if(i <= 70){ // if i less than or equal to 70 decrease i
                i--;
            }
            if(i<= 40){ //if i is less than or equal to 40 decrease i
                i--;
            }

        }
        return i; // as we want to see the value of i
    }
}
