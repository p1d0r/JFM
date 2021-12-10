package ru.mirea.task5.var2;

public class SibaInu extends Dog{
    public SibaInu(String name, int age) {
        super(name, age);
    }

    @Override
    String getType() {
        return "Сиба-Ину";
    }
}
