package ru.deniskozlov.javadeveloperschool2023.hw_2023_12_21.exercise2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phonebook {
    private final Map<String, List<String>> phonebook = new HashMap<>();

    public void add(String surname, String phoneNumber) {
        if (!phonebook.containsKey(surname)) {
            List<String> phoneNumberList = new ArrayList<>();
            phoneNumberList.add(phoneNumber);
            phonebook.put(surname, phoneNumberList);
        } else {
            phonebook.get(surname).add(phoneNumber);
        }
    }

    public List<String> get(String surname) {
        return phonebook.get(surname);
    }
}
