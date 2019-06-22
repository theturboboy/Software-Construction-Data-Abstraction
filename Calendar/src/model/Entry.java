package model;

public abstract class Entry {
    Date date;
    Time time;
    String label;
    Integer interval;

    public Entry(Date date, Time time, String label) {
        this.date = date;
        this.time = time;
        this.label = label;
    }

    public Date getDate() {
        return this.date;
    }

    public Time getTime() {
        return this.time;
    }

    public String getLabel() {
        return this.label;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    public Integer getInterval() {
        return this.interval;
    }
}
