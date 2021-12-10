package ru.mirea.task10.opt16;

import java.util.Scanner;

public class Task {
    public static void main(String []args)
    {
        function();
    }
    static void function()
    {
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.next();
        int max=0;
        int kol=0;
        for (int i=0;i<s.length();i++)
        {
            if ((int)s.charAt(i)>max) {
                max = (int) s.charAt(i);
                kol=0;
            }
            if((int)s.charAt(i)==max)
                kol++;
        }
        System.out.println(kol);
    }
}
