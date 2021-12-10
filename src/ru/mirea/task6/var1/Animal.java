package ru.mirea.task6.var1;

public class Animal implements Nameable{
    private String name,type;

    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getName() {
        return "Кличка животного: "+name;
    }
}
