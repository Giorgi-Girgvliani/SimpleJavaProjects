import java.time.Clock;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyDate {
    private int year, month, day;
    MyDate(){
        year = LocalDate.now().getYear();
        month = LocalDate.now().getMonthValue()-1;
        day = LocalDate.now().getDayOfMonth();
    }
    public MyDate(long elapsedTime) {
        Calendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime);
        this.year = calendar.get(Calendar.YEAR);
        this.month = calendar.get(Calendar.MONTH) + 1; // Calendar.MONTH is 0-based
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
    }
    MyDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "year: " + getYear() + "\nmonth: " + getMonth() +
                "\nday: " + getDay();
    }

    public static void main(String[] args) {
        MyDate myDate1 = new MyDate();
        MyDate myDate2 = new MyDate(34355555133101L);
        System.out.println(myDate1);
        System.out.println(myDate2);
    }
}
