package ru.mirea.task3.opt3;

public class TestBook {
    public static void main(String []args) {
        Book book = new Book("Война и мир", "Л.Н. Толстой", 1000000, 1869);
        System.out.println(book.toString());
        book.setName("Сказка о золотом петушке");
        book.setAuthor("А.С. Пушкин");
        book.setYear(1833);
        book.setPage(30);
        System.out.println(book.toString());
    }
}
