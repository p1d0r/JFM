package ru.mirea.task6.var1;

public class Book implements Nameable{
    private String name,author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String getName() {
        return "Название книги: "+name;
    }
}
