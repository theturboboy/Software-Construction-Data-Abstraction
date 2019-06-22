package model;

public class Reminder extends Entry {
    String note;

    public Reminder(Date date, Time time, String label) {
        super(date, time, label);
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getNote() {
        return note;
    }
}
