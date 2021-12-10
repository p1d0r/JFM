package ru.mirea.task1.opt5;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        int a;
        System.out.print("Введите число, факториал которого хотите посчитать ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a > 0)
            System.out.println(fact(a));
        else
            System.out.println("Ошибка, число должно быть больше 0");
    }
    public static int fact(int a)
    {
        if(a==0)
            return 1;
        else return a*fact(a-1);
    }
}