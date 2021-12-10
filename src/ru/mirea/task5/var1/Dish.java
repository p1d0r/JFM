package ru.mirea.task5.var1;

public abstract class Dish {
    private String type,material;

    public Dish(String type, String material) {
        this.type = type;
        this.material = material;
    }
    public abstract void doPurpose();
}
