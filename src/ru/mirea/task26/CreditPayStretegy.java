package ru.mirea.task26;

import java.util.Scanner;

public class CreditPayStretegy implements PayStrategy{
    @Override
    public void pay() {
        System.out.println("Для оплаты с помощью кредитной карты введите номер карты и CVV");
        Scanner sc=new Scanner(System.in);
        sc.next();
        sc.next();
        System.out.println("Оплата успешно проведена");
    }
}
