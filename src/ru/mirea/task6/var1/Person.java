package ru.mirea.task6.var1;

public class Person implements Nameable{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return "Имя человека: "+name;
    }
}
