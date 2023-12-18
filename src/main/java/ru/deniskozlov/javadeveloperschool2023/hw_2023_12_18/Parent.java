package ru.deniskozlov.javadeveloperschool2023.hw_2023_12_18;

public abstract class Parent {
    private String Name;

    static {
        System.out.println("Parent:static 1");
    }

    {
        System.out.println("Parent:instance 1");
    }

    static {
        System.out.println("Parent:static 2");
    }

    public Parent() {
        System.out.println("Parent:constructor");
    }

    {
        System.out.println("Parent:instance 2");
    }

    public Parent(String Name) {
        this.Name = Name;

        System.out.println("Parent:name-constructor");
    }

}
