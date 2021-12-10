package ru.mirea.task6.var2;

public class Task {
    public static void main(String []args)
    {
        Priceable priceable=new Chocolate(50,"Milka");
        System.out.println("Стоимость шоколадки: "+priceable.getPrice());
        priceable=new Phone(15000,"Нокиа");
        System.out.println("Стоимость телефона: "+priceable.getPrice());
        priceable=new Tea(150,"Lipton");
        System.out.println("Стоимость чая: "+priceable.getPrice());
    }
}
