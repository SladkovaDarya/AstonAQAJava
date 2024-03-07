package secondTask;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, String> contactList = new HashMap<>();

    public void add(String phone, String surname) {
        contactList.put(phone, surname);
    }

    public void get(String surname) {
        for (Map.Entry<String, String> ss : contactList.entrySet()) {
            if (ss.getValue().equals(surname)) {
                System.out.println(ss.getKey() + " : " + ss.getValue());
            }
        }
    }
}
