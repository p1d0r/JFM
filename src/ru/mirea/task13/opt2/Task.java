package ru.mirea.task13.opt2;

import java.util.LinkedList;

public class Task {
    public static void main(String[]args)
    {
        LinkedList<Integer>a=new LinkedList<>();
        for (int i=1;i<21;i++)
            a.add(i);
        System.out.println(a);
        a.removeIf(i->(i%2==0));
        System.out.println(a);
        System.out.println(a.contains(10)?1:-1);
        a.addFirst(10);
        a.addLast(20);
        System.out.println(a);
        System.out.println(a.contains(10)?1:-1);
        a.clear();
        System.out.println(a);
    }
}