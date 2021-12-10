package ru.mirea.task25;

public class OptionPercent implements Percent {
    private Percent percent;
    private int discount;

    public OptionPercent(Percent percent,int discount) {
        this.percent = percent;
        this.discount = discount;
    }

    @Override
    public int getPercent() {
        return percent.getPercent()-this.discount;
    }
}
