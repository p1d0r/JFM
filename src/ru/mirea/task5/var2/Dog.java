package ru.mirea.task5.var2;

public abstract class Dog {
    private int age;
    private String name;
    public Dog(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract String getType();

    @Override
    public String toString() {
        return "Кличка: "+getName()+", возраст: "+getAge()+", породы: "+getType();
    }
}
