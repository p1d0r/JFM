package ru.mirea.task2.Dog;

import ru.mirea.task2.Dog.Dog;

public class TestDog {
    public static void main(String [] args)
    {
        Dog dog=new Dog("Скуби-Ду",7);
        System.out.println(dog);
        dog.setAge(10);
        dog.setName("Гена");
        System.out.println(dog);
    }
}
