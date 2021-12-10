package ru.mirea.task25;

public class Credit implements Percent {
    private int percent=15;

    public Credit(){}

    @Override
    public int getPercent() {
        return this.percent;
    }
}
