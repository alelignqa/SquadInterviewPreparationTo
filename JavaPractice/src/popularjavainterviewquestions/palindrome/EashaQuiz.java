package popularjavainterviewquestions.palindrome;

public class EashaQuiz {

        //Write a Java Program to find whether a string or number is palindrome or not.
        //Ex: mom, dad, poop, race car, nurses run

        public static void main(String[] args) {
            String word = "race car";
            word = word.replace(" ", ""); // since strings are immutable we must store this in a string
            EashaQuiz.checkPalindrome(word);

            EashaQuiz.anotherWay(word);

        }

        public static String checkPalindrome(String word){

            //hold the length
            int wordLength = word.length();


            //reverse the word

            String reverse = "";
            for (int i = wordLength - 1; i >= 0; i--) {
                reverse += word.charAt(i);
            }

            System.out.println("\033[0;1m" +reverse);// just to make sure it did reverse

            //end of 10 min


            //now to compare to original string
            boolean isPalindrome = true;

            for(int i =0; i < wordLength; i++) {
                if (word.charAt(i) != reverse.charAt(i)) { // now we need to compare the character at original vs reverse
                    // and if not the same then it is not a palindrome
                    isPalindrome = false; // this defines when it is not true
                }
            }
            // if palindrome is true then it'll print this
            if(isPalindrome) {
                System.out.println("The word " + "'" + word.toUpperCase() + "'" + " is a Palindrome");

            } else {
                System.out.println("The word " +"'"+word.toUpperCase()+"'" + " is NOT Palindrome");

            }

            return word;

        }

        public static void anotherWay(String word){
            String reverse = "";
            for(int i = word.length()-1; i >= 0; i --){
                reverse += word.charAt(i);
            }
            if(word.equalsIgnoreCase(reverse)){
                System.out.println("'"+word.toUpperCase()+"'" + " is a Palindrome");
            }else{
                System.out.println("'"+word.toUpperCase()+"'" + " is not a Palindrome");
            }
        }
    }



