package no.hiof.leapyear;

public class LeapYear {
    public LeapYear(){
    }

    public boolean isLeapYear(int year){
        boolean truth = false;
        if (year % 4 == 0 && year % 100 != 0){
           truth = true;
        }
        else if (year % 400 == 0) {
            truth = true;
        }
        else if (year % 400 != 0 && year % 100 == 0){
            truth = false;
        }
        else if (year % 4 != 0) {
            truth = false;
        }
        return truth;
    }
}
