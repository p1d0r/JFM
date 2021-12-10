package ru.mirea.task5.var2;

public class Task {
    public static void main(String []args)
    {
        Dog dog=new SibaInu("Хатико",5);
        System.out.println(dog.toString());
        dog=new Sheepdog("Рекс",10);
        System.out.println(dog.toString());
        dog=new Bulldog("Спайк",4);
        System.out.println(dog.toString());
        dog=new JackRussel("Jack",12);
        System.out.println(dog.toString());

    }
}
