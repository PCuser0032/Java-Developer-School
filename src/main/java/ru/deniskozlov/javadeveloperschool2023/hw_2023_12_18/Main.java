package ru.deniskozlov.javadeveloperschool2023.hw_2023_12_18;

public class Main {
    public static void main(String[] args) {
        System.out.println("Child():");
        Child child = new Child();

        System.out.println("\nChild(\"Ivan\"):");
        Child childWithName = new Child("Ivan");
    }
}