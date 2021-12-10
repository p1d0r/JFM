package ru.mirea.task5.var2;

public class Bulldog extends Dog{


    public Bulldog(String name, int age) {
        super(name, age);
    }

    @Override
    String getType() {
        return "Бульдог";
    }

}
