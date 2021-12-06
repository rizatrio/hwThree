/*
 *    Rizat.Orazalina created on 06.12.2021
 */

import java.util.*;

public class Phonebook {

    private HashMap<String, List<String>> phoneBook;

    public Phonebook() {
        this.phoneBook = new HashMap<>();
    }

    public void add(String surname, String phoneNumber) {
        if (phoneBook.containsKey(surname)) {
            List<String> phoneNumbers = phoneBook.get(surname);
            if (!phoneNumbers.contains(phoneNumber)) {
                phoneNumbers.add(phoneNumber);
                System.out.printf("Телефон номер %s добавлен для фамилии %n", phoneNumber, surname);
            } else {
                System.out.printf("Телефон номер %s уже существует для фамилии %n", phoneNumber, surname);
            }
        } else {
            phoneBook.put(surname, new ArrayList<>(Arrays.asList(phoneNumber)));
            System.out.printf("Номер %s добавлен для фамилии %n", phoneNumber, surname);
        }
    }

    public List<String> get(String surname) {
        if (phoneBook.containsKey(surname)) {
            System.out.printf("В телефонном справочнике есть запись для фамилии %s ", surname);
            return phoneBook.get(surname);
        } else {
            System.out.printf("В телефонном справочнике нет записи для фамилии %n", surname);
            return new ArrayList<>();
        }
    }
}
