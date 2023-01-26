package Model;

import java.util.Map;

public class Contact {

    private String firstName;
    private String lastName;
    public Map<String, String> communication;

    public Contact(String firstName, String lastName, Map<String, String> communication) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.communication = communication;
    }

    @Override
    public boolean equals(Object obj) {
        Contact t = (Contact) obj;
        return this.firstName.equals(t.firstName)
                && this.lastName.equals(t.lastName);
    }

    public String fullName() {
        return String.format("%s %s", firstName, lastName);
    }

    @Override
    public String toString() {
        return "Contact: name = " + firstName + ", lastName = " + lastName + "\ncommunication: " + communication + "\n";
    }
}