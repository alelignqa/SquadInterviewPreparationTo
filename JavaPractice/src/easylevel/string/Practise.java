package easylevel.string;

public class Practise {

    public static void main(String[] args) {
        Practise.test("cat", "at");
    }

    public static void test(String name, String x) {


        int a = name.length();
        int b = x.length();

        if (name.charAt(a - 1) == x.charAt(b - 1) && name.charAt(a - 2) == x.charAt(b - 2)) {
            System.out.println("they have same char");
        } else {
            System.out.println(" not ");
        }
    }
}
