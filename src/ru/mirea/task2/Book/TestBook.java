package ru.mirea.task2.Book;

import ru.mirea.task2.Book.Book;

public class TestBook {
    public static void main(String [] args)
    {
        Book bk=new Book("Война и мир","Толстой",8);
        System.out.println(bk);
        bk.setAuthor("Достоевский");
        bk.setName("Преступление и наказание");
        bk.setRate(7);
        System.out.println(bk);
    }
}
