package popularjavainterviewquestions.reversestring;

public class EashaQuiz {

    public static void main(String[] args) {
        String word = "mango";
        EashaQuiz.reverseMyString(word);
    }

    public static void reverseMyString(String word){
        String reverse = " ";
        int i;
        for(i=word.length()-1; i>=0; i--){
            reverse += word.charAt(i);
        }
        System.out.println(reverse);
    }
}
