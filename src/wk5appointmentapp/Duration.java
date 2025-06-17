package wk5appointmentapp;

public class Duration {
    private int hours;
    private int minutes;

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes() {
        this.minutes = minutes;
    }

    public Duration(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }
}
