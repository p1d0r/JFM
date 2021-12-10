package ru.mirea.task6.var1;

public class Task {
    public static void main(String [] args)
    {
        Nameable nameable=new Book("Наруто","Кисимото");
        System.out.println(nameable.getName());
        nameable=new Person("Андрей",99);
        System.out.println(nameable.getName());
        nameable=new Animal("Кеша","Попугай");
        System.out.println(nameable.getName());
    }
}