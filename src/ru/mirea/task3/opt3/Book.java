package ru.mirea.task3.opt3;

public class Book {
    private String name,author;
    private int page,year;

    public Book(String name, String author, int page, int year) {
        this.name = name;
        this.author = author;
        this.page = page;
        this.year=year;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear(){return year;}

    public int getPage(){return page;}

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString()
    {
        return "Книга: "+getName()+" автора "+getAuthor()+","+getYear()+" года издания";
    }
}
