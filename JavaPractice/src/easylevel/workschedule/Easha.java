package easylevel.workschedule;

import java.util.Scanner;

public class Easha {


    public static void main(String[] args) {

        Easha.workSchedule();

    }

    public static void workSchedule() {


        Scanner scan = new Scanner(System.in);
        System.out.println("What day is today?");
        String input = scan.nextLine();
        while (input != null) {
            if (input.equalsIgnoreCase("Sunday")) {
                System.out.println("Go back to sleep, its just Sunday!");
            } else if (input.equalsIgnoreCase("Monday")) {
                System.out.println("Ugh i hate mondays too, go to work!");
            } else if (input.equalsIgnoreCase("Tuesday")) {
                System.out.println("Its Tuesday, get up sleepy head!");
            } else if (input.equalsIgnoreCase("Wednesday")) {
                System.out.println("Woohoo! Hump day baby!!");
            } else if (input.equalsIgnoreCase("Thursday")) {
                System.out.println("Almost to the weekend you got this!!");
            } else if (input.equalsIgnoreCase("Friday")) {
                System.out.println("TGIF YAY!");
            } else if (input.equalsIgnoreCase("Saturday")) {
                System.out.println("WOOHOO the weekend is finally here!!");
            } else {
                System.out.println("My guy, thats not even a day. Someone had a long week!");
            }
             input = scan.nextLine();
        }
        scan.close();

    }




}
