import java.util.Calendar;

//10.1
public class Time {
    private int hour;
    private int minute;
    private int second;
    Time(){
        millisConverter(System.currentTimeMillis());
    }
    Time(long elapsedTime){
        millisConverter(elapsedTime);
    }

    Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    private void millisConverter(long elapsedTime){
        long total_seconds = elapsedTime / 1000;
        this.second = (int) total_seconds % 60;
        long total_minutes = total_seconds / 60;
        this.minute = (int) total_minutes % 60;
        long total_hours = total_minutes / 60;
        this.hour = (int) total_hours % 24;
    }

    @Override
    public String toString() {
        return "hour: " + getHour() + "\n" + "minute: " + getMinute() + "\n" + "second: " + getSecond();
    }

    public void setTime(long elapsedTime){
        millisConverter(elapsedTime);
    }

    public static void main(String[] args) {
        Time time1 = new Time();
        Time time2 = new Time(555550000);
        System.out.println("time1: " + time1 + "\nTime2: " + time2);
    }

}
