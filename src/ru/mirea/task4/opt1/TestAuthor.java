package ru.mirea.task4.opt1;

import ru.mirea.task4.opt1.Author;

public class TestAuthor {
    public static void main(String [] args)
    {
        Author author=new Author("Avtor1","Avtor1@mail.ru",'M');
        System.out.println(author);
        author.setEmail("Avtor2@mail.ru");
        author.setName("Avtor2");
        author.setGender('W');
        System.out.println(author);
    }
}
