package ru.mirea.task5.var3;

public class Chair extends Furniture{
    public Chair(String name,int price) {
        super(name,price);
    }

    @Override
    String getType() {
        return "Стул";
    }

    @Override
    String getFunction() {
        return "На нем можно сидеть";
    }
}
