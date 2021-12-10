package ru.mirea.task13.opt3;

public class Task {
    public static void main(String[]args)
    {
        ArrayList a=new ArrayList();
        for (int i=1;i<21;i++)
            a.add(i);
        System.out.println(a);
        a.removeIf(i->((int)i%2==0));
        System.out.println(a);
        System.out.println(a.contains(10)?1:-1);
        a.clear();
        System.out.println(a);
    }
}
