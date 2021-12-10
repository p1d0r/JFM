package ru.mirea.task5.var1;

public class Plate extends Dish{
    public Plate(String type, String material) {
        super(type, material);
    }

    @Override
    public void doPurpose() {
    System.out.print("Put smh");
    }
}
