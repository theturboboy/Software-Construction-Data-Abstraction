package model;

public class Event extends Entry {
    Reminder reminder;

    public Event(Date date, Time time, String label) {
        super(date, time, label);
    }

    public void setReminder(Reminder reminder) {
        this.reminder = reminder;
    }

    public Reminder getReminder() {
        return reminder;
    }
}
