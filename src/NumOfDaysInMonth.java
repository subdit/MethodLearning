public class NumOfDaysInMonth {
    public static void main(String[] args) {
       boolean itIsALeapYear =  isLeapYear(2006);
        System.out.println("Is : "+isLeapYear(2009)  + " it a leap year");
    }
    public static boolean isLeapYear(int year){
        if(year <= 1|| year <= 99999){
            return false;
        }else if((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)){
            return true;
        }else {
            return false;
        }

    }
}
