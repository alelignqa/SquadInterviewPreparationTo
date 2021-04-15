package easylevel.workschedule;

public class Negash {

    public static void main(String[] args) {
//        Negash.daysOfWeek("sunday");
//            Negash.weekOfDays(3);
            Negash.daysOfWeek1("wen");

    }

    public static void daysOfWeek(String day) {
        if (day.equalsIgnoreCase(String.valueOf(Days.MONDAY))) {
            System.out.println("Welcome to the Money day - 1st working day");
        } else if ((day.equalsIgnoreCase(String.valueOf(Days.TUESDAY)))) {
            System.out.println("Day of Hope - left with 3 more days for a break");
        } else if ((day.equalsIgnoreCase(String.valueOf(Days.WEDNESDAY)))) {
            System.out.println("Welcome to windy day - Middle of the week");
        } else if ((day.equalsIgnoreCase(String.valueOf(Days.THURSDAY)))) {
            System.out.println("Welcome to truest day - I see the weekend");
        } else if ((day.equalsIgnoreCase(String.valueOf(Days.FRIDAY)))) {
            System.out.println("Welcome to a fry day - chips or chicken?");
        } else if ((day.equalsIgnoreCase(String.valueOf(Days.SATURDAY)))) {
            System.out.println("Welcome to couch day - sit and relax");
        } else if ((day.equalsIgnoreCase(String.valueOf(Days.SUNDAY)))) {
            System.out.println("Welcome to sun day - get out and get some vitamin D");
        }
    }

    public static void weekOfDays(int num) {

        Days day = null;
        switch (num) {
            case 1:
                day = Days.MONDAY;
                break;
            case 2:
                day = Days.TUESDAY;
                break;
            case 3:
                day = Days.WEDNESDAY;
                break;
            case 4:
                day = Days.THURSDAY;
                break;
            case 5:
                day = Days.FRIDAY;
                break;
            case 6:
                day = Days.SATURDAY;
                break;
            case 7:
                day = Days.SUNDAY;
                break;
            default:
                day = Days.UNKNOWN;
                break;
        }
        System.out.println("The day is " + day);
    }

    public static void daysOfWeek1(String day) {

        Days da;
        if (day.equalsIgnoreCase("mon")) {
            da = Days.MONDAY;
        } else if (day.equalsIgnoreCase("tue")) {
            da = Days.TUESDAY;
        } else if (day.equalsIgnoreCase("wen")) {
            da = Days.WEDNESDAY;
        } else if (day.equalsIgnoreCase("thu")) {
            da = Days.THURSDAY;
        } else if (day.equalsIgnoreCase("fri")) {
            da = Days.FRIDAY;
        } else if (day.equalsIgnoreCase("sat")) {
            da = Days.SATURDAY;
        } else if (day.equalsIgnoreCase("sun")) {
            da = Days.SUNDAY;
        }else
            da = Days.UNKNOWN;
        System.out.println(da);
    }


}

enum Days {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY,UNKNOWN;

}
