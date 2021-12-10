package ru.mirea.task10.opt13;

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
        for (int i=0;i<s.length();i++)
        {
            if (i%2==0&&s.charAt(i)!='0')
                System.out.println(s.charAt(i)+" ");
        }
    }
}
