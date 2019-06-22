package model;

import java.util.HashSet;

public class Meeting extends Event {
    HashSet<String> attenders;

    public Meeting(Date date, Time time, String label) {
        super(date, time, label);
        attenders = new HashSet<String>();
    }

    public void addAttender(String email) {
        attenders.add(email);
    }

    public void removeAttender(String email) {
        attenders.remove(email);
    }

    public HashSet<String> getAttenders() {
        return attenders;
    }

    public void sendInvitations() {
        for (String email : attenders) {
            System.out.println("Inviting: " + email);
        }
    }
}
