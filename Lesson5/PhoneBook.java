package Lesson5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<String>> book;

    public PhoneBook() {
        book = new HashMap<>();
    }

    public void add(String surname, String number) {
        book.computeIfAbsent(surname, k -> new ArrayList<>()).add(number);
    }
    public List<String>get(String surname){
        return book.getOrDefault(surname,new ArrayList<>());
    }
}