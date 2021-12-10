package ru.mirea.task5.var3;

public class Sofa extends Furniture {
    public Sofa(String name,int price) {
        super(name,price);
    }

    @Override
    String getType() {
        return "Диван";
    }

    @Override
    String getFunction() {
        return "На нем можно лежать(спать)";
    }
}
