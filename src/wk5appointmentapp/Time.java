package wk5appointmentapp;

public class Time {

    private int hour;
    private int minute;
    private String meridiem;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public String getMeridiem() {
        return meridiem;
    }

    public void setMeridiem(String meridiem) {
        this.meridiem = meridiem;
    }

    public Time(int hour, int minute, String meridiem) {
        this.hour = hour;
        this.minute = minute;
        this.meridiem = meridiem;
    }
}
