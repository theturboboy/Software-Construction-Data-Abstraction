package model;

import java.util.HashMap;

public class Date {
    String year;
    String month;
    String day;
    HashMap<String, String> months;

    public Date(String year, String month, String day) {
        this.year = year;
        this.month = month;
        this.day = day;
        months = new HashMap<String, String>();
        months.put("1", "Jan");
        months.put("2", "Feb");
        months.put("3", "Mar");
        months.put("4", "Apr");
        months.put("5", "May");
        months.put("6", "Jun");
        months.put("7", "Jul");
        months.put("8", "Aug");
        months.put("9", "Sep");
        months.put("10", "Oct");
        months.put("11", "Nov");
        months.put("12", "Dec");
    }

    public String getShortDate() {
        return this.year + "-" + this.month + "-" + this.day;
    }

    public String getLongDate() {
        return months.get(this.month) + " " + this.day + ", " + this.year;
    }

}
