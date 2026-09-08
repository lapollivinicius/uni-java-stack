package src.advanced;

public class Enums {

    // it is a class that's used to declare CONSTANTS
    // class name rule and constants name rule
    enum Month {
        JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEP
    }

    public static void main(String[] args) {

        // "instance" an enum
        Month january = Month.JAN;
        System.out.println(january);

        // import enum
        WeekDaysEnum wd = WeekDaysEnum.FRI;
        System.out.println(wd); // same wd.name()

        // return position
        System.out.println(wd.ordinal());

        // to find some enum (return pos)
        System.out.println(WeekDaysEnum.valueOf("SUN").getNumDay());



    }

}
