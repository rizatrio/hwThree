/*
 *    Rizat.Orazalina created on 06.12.2021
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
        Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
        Посчитать сколько раз встречается каждое слово.*/

        List<String> list = new ArrayList<>(Arrays.asList("New-York", "Sidney", "Seul",
                "Moskva", "Kipr", "Sidney", "Bishkek", "Brazilia", "Moskva",
                "Nur-Sultan", "London", "Kipr", "Praga", "London", "Moskva"));

        Set<String> uniqueSet = new HashSet<>(list);
        System.out.println(list);
        System.out.println(uniqueSet);

        Map<String, Integer> map = new HashMap<>();
        for (String  word : uniqueSet) {
            map.put(word, Collections.frequency(list, word));
        }
        System.out.println(map);

        /*2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
        В этот телефонный справочник с помощью метода add() можно добавлять записи. С помощью метода get() искать номер
        телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
        тогда при запросе такой фамилии должны выводиться все телефоны.
        Желательно как можно меньше добавлять своего, чего нет в задании (т.е. не надо в телефонную запись добавлять еще
        дополнительные поля (имя, отчество, адрес), делать взаимодействие с пользователем через консоль и т.д.).
        Консоль желательно не использовать (в том числе Scanner), тестировать просто из метода main() прописывая add() и get().*/

        Phonebook phonebook = new Phonebook();

        phonebook.add("Rustemov", "7477221236");
        phonebook.add("Alimbetov", "22334411");
        phonebook.add("Orazalina", "7074052138");
        phonebook.add("Ivanov", "22334488");

        System.out.println(phonebook.get("Alimbetov"));
        System.out.println(phonebook.get("Rustemov"));
        System.out.println(phonebook.get("Orazalina"));
        System.out.println(phonebook.get("Baryshev"));

        phonebook.add("Orazalina", "7074052138");
        System.out.println(phonebook.get("Orazalina"));

        phonebook.add("Orazalina", "789456123");
        System.out.println(phonebook.get("Orazalina"));
    }
}
