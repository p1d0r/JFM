package ru.mirea.task26;

public class Payment {
    PayStrategy payStrategy;
    public void pay()
    {
        payStrategy.pay();
    }

}
