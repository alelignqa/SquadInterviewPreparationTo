package easylevel.string;

public class Reto {

    public static void main(String[] args) {
       Reto.matchString("Cat","at");
    }

    public static void matchString(String word1, String word2){
        if(word1.endsWith(word2)){
            System.out.println("Congratulations, its a match");
        }else{
            System.out.println("BooHoo!! You will find a match soon");
        }
    }
}
