package model;

public class Time {
    Integer hours;
    Integer minutes;

    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public String getTime() {
        return this.hours + ":" + this.minutes;
    }
}
