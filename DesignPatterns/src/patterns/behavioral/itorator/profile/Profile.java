package patterns.behavioral.itorator.profile;

import java.util.*;

public class Profile {
    private String name;
    private String email;
    private Map<String, List<String>> contacts = new HashMap<>();   //Map<contactType, List<contactEmail>>

    public Profile(String name, String email, String... contacts ) {    //arbitrary number of parameters
        this.name = name;
        this.email = email;

        //parse contact from a set of "friend:email@gmail.com" pair.

        for (String contact : contacts) {
            String[] parts = contact.split(":");    //contact has 2 element = {contactType, contactEmail}
            String contactType = "friend";
            String contactEmail;
            if (parts.length == 1) {
                contactEmail = parts[0];
            } else {
                contactType = parts[0];
                contactEmail = parts[1];
            }
            if (!this.contacts.containsKey(contactType)) {
                this.contacts.put(contactType, new ArrayList<>());
            }
            //get(contactType) return List<contactEmail> from Map<contactType, List<contactEmail>
            //has keyValue = contactType
            this.contacts.get(contactType).add(contactEmail);
        }

    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public List<String> getContacts(String contactType) {
        if (!this.contacts.containsKey(contactType)) {
            this.contacts.put(contactType, new ArrayList<>());
        }
        return contacts.get(contactType);
    }


}

