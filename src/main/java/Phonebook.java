/*
 *    Rizat.Orazalina created on 06.12.2021
 */

import java.util.*;

public class Phonebook {

    private HashMap<String, List<String>> list = new HashMap<>();

    public void add(String surname, String number) {
        if (list.containsKey(surname)) {
            if (!list.get(surname).contains(number)) {
                list.get(surname).add(number);
            }
        } else {
            list.put(surname, new ArrayList<>(Collections.singletonList(number)));
        }
    }

    public List<String> get(String surname) {
        return  list.get(surname);
    }
}
