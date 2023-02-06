package PhoneBookTestVers2;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class PhoneBookVers2 {

    private final Map<String, Set<String>> entries = new TreeMap<>();

    private Set<String> getPhones(String surname){
        return entries.getOrDefault(surname, new HashSet<>());
    }

    public void add(String surname, String phoneNumber){
        Set<String> phones = getPhones(surname);
        phones.add(phoneNumber);
    }


}
