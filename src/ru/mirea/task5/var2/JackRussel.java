package ru.mirea.task5.var2;

public class JackRussel extends Dog{
    public JackRussel(String name, int age) {
        super(name, age);
    }

    @Override
    String getType() {
        return "Джек-рассел терьер";
    }
}
