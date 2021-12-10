package ru.mirea.task10.opt14;

import java.util.Scanner;

public class Task {
    public static void main(String []args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        function(n);
    }
    static void function(int a)
    {
        if (a>10)
            function(a/10);

        System.out.print(a%10+" ");
    }
}
