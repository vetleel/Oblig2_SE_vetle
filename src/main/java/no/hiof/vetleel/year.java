package no.hiof.vetleel;

public class year {

    public static boolean isLeapYear(int year){

        if(modulo(year, 400) == 0  || modulo(year, 4) == 0 && modulo(year, 100) >= 1)
            return true;

        return false;

    }
    public static int modulo(int number, int modulo) {
        return number % modulo;
    }
}
