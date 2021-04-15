package easylevel.string;

public class Negash {

    public static void main(String[] args) {
        playOnStrings("Cat", "at");
        playOnStrings("Moon", "Son");
        playOnStrings("Man", "Woman");
        playOnStrings("Male", "Female");
    }

    public static void playOnStrings(String first, String second) {

        boolean save = first.endsWith(second);
        System.out.println(save);

        int s1 = first.length();
        int s2 = second.length();
        String one = first.substring(s1 - 2, s1 - 1);
        String two = second.substring(s2 - 2, s2 - 1);
        if (one.equalsIgnoreCase(two)) {
            System.out.println("The last two chars of the strings are identical");
        } else
            System.out.println("The last two chars of the strings are not identical");

//        int hold = first.compareToIgnoreCase(second);
//        System.out.println(hold);

    }
}
