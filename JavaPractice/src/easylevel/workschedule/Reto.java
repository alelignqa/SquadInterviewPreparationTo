package easylevel.workschedule;

import java.util.Scanner;

public class Reto {
    public static void main(String[] args) {
        Reto.workSchedule();
    }

    public static void workSchedule(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Saturday = sat\n" +
                "Sunday = sun\n" +
                "Monday = mon\n" +
                "Tuesday = tues\n" +
                "Wednesday = wed\n" +
                "Thursday = thurs\n" +
                "Friday = fri");
        System.out.print("Please enter a day: ");
        String day = scan.nextLine();
        while(day!= null){
            switch (day) {
                case "sat":
                    System.out.println("Yay no work");
                    break;
                case "sun":
                    System.out.println("Still no work.. but guess what, WORK tomorrow woohooo");
                    break;
                case "mon":
                    System.out.println("First day of the week ");
                    break;
                case "tues":
                    System.out.println("Work work work work");
                    break;
                case "Wed":
                    System.out.println("Welp two days more. you got this");
                    break;
                case "thurs":
                    System.out.println("yeaa boiiiiiiii.. you know what day it is....");
                    break;
                case "fri":
                    System.out.println("its party time.... frydayyyy");
                    break;
                default:
                    System.out.println("c'mon bro, follow the instruction");
                    break;
            }
            day = scan.nextLine();
        }
    }
}
