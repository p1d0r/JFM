package ru.mirea.task5.var3;

public class Table extends Furniture{
    public Table(String name,int price) {
        super(name,price);
    }

    @Override
    String getType() {
        return "Стол";
    }

    @Override
    String getFunction() {
        return "На него можно что-то положить";
    }
}
