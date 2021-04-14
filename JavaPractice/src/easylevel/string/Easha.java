package easylevel.string;

public class Easha {

    public static void main(String[] args) {
        Easha.endOfWords("Hat","Bat");
    }

    public static void endOfWords(String name, String name2){
        if(name.endsWith("at") == name2.endsWith("at")){

            System.out.println("Both your words ends same");
        }else if(name.endsWith("at") != name2.endsWith("at")){
            System.out.println("Those words do not end the same");
        }
    }

}
