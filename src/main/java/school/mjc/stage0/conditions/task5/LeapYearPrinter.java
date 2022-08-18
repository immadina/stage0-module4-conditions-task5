package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        //"leap" if true otherwise "not leap"
        //A leap year is a year that is divisible by 4 and 400 without a remainder
        int remainder;
        if (year % 100 == 0 && year % 400 == 0) {
            remainder = 0;
        } else if (year % 100 != 0 && year % 4 == 0) {
            remainder = 0;
        } else {
            remainder = 1;
        }
        switch (remainder) {
            case (0):
                System.out.println("leap");
                break;
            case (1):
                System.out.println("not leap");
                break;
        }
    }
}
