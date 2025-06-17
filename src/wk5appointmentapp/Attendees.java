package wk5appointmentapp;

import java.util.ArrayList;
import java.util.List;

public class Attendees {
    private String host;
    List<String> invitees = new ArrayList<>();

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public List<String> getInvitees() {
        return invitees;
    }

    public void setInvitees(List<String> invitees) {
        this.invitees = invitees;
    }

    public Attendees(String host, List<String> invitees) {
        this.host = host;
        this.invitees = invitees;
    }
}
