package ru.deniskozlov.javadeveloperschool2023.hw_2023_12_21.exercise2;

public class Main {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        phonebook.add("Avdeev", "+7 000 000-00-01");
        phonebook.add("Borisov", "+7 000 000-00-02");
        phonebook.add("Gladkov", "+7 000 000-00-03");
        phonebook.add("Debrov", "+7 000 000-00-04");
        phonebook.add("Eremeev", "+7 000 000-00-05");
        phonebook.add("Avdeev", "+7 000 000-00-06");
        phonebook.add("Debrov", "+7 000 000-00-07");
        phonebook.add("Avdeev", "+7 000 000-00-08");
        phonebook.add("Zheglov", "+7 000 000-00-09");
        phonebook.add("Borisov", "+7 000 000-00-10");
        phonebook.add("Avdeev", "+7 000 000-00-11");
        phonebook.add("Zheglov", "+7 000 000-00-12");
        phonebook.add("Debrov", "+7 000 000-00-13");
        phonebook.add("Zaitsev", "+7 000 000-00-14");

        System.out.format("Avdeev: %s%s", phonebook.get("Avdeev"), '\n');
        System.out.format("Borisov: %s%s", phonebook.get("Borisov"), '\n');
        System.out.format("Gladkov: %s%s", phonebook.get("Gladkov"), '\n');
        System.out.format("Debrov: %s%s", phonebook.get("Debrov"), '\n');
        System.out.format("Eremeev: %s%s", phonebook.get("Eremeev"), '\n');
        System.out.format("Zheglov: %s%s", phonebook.get("Zheglov"), '\n');
        System.out.format("Zaitsev: %s", phonebook.get("Zaitsev"));
    }
}