package ru.mirea.task13.opt1;

import java.util.ArrayList;

public class Task {
    public static void main(String[]args)
    {
        ArrayList<Integer>a=new ArrayList<>();
        for (int i=1;i<21;i++)
            a.add(i);
        System.out.println(a);
        a.removeIf(i->(i%2==0));
        System.out.println(a);
        System.out.println(a.contains(10)?1:-1);
        a.clear();
        System.out.println(a);
    }
}
