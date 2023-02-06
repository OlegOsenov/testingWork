package PhoneBookTestVers2;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class PhoneBookVers2 {

    private final Map<String, Set<String>> entries = new TreeMap<>();

    /**
     *
     * @param surname принимает на вход фамилию
     * @return возвращает набор номеров которые есть у нас для этой фамилии
     */
    private Set<String> getPhones(String surname){
        return entries.getOrDefault(surname, new HashSet<>());
    }

    /**
     *
     * @param surname фамилия
     * @return возвращает фамилию
     */
    public Set<String> get(String surname) {
        return getPhones(surname);
    }


    /**
     *
     * @return возвращает все фамилии set из ключей
     */
    public Set<String> getAllSurname(){
        return entries.keySet();
    }

    /**
     *
     * @param surname передают на добавления фамилию
     * @param phoneNumber передают номер телефона на добавление
     */

    public void add(String surname, String phoneNumber){
        Set<String> phones = getPhones(surname);
        phones.add(phoneNumber);
    }


}
