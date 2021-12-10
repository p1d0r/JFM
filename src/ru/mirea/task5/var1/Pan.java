package ru.mirea.task5.var1;

public class Pan extends Dish {
    public Pan(String type, String material) {
        super(type, material);
    }

    @Override
    public void doPurpose() {
        System.out.println("Frying smh");
    }
}
