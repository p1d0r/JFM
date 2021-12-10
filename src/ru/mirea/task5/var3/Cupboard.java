package ru.mirea.task5.var3;

public class Cupboard extends Furniture{
    public Cupboard(String name,int price) {
        super(name,price);
    }

    @Override
    String getType() {
        return "Шкаф";
    }

    @Override
    String getFunction() {
        return "В нем можно что-то хранить";
    }
}
