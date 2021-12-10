package ru.mirea.task5.var3;

public abstract class Furniture {
    private int count,price;
    private String name;

    public Furniture( String name,int price) {
        this.price = price;
        this.name = name;
        count=0;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void add()
    {
        count++;
    }
    public void take()
    {
        count--;
    }
    abstract String getType();
    abstract String getFunction();
}
