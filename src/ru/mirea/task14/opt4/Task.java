package ru.mirea.task14.opt4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task {
    public static void main(String[]args)
    {
        List<Double> a=new LinkedList<>();
        List<Double> b=new LinkedList<>();
        int []c=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите карты 1-ого игрока");
        for(int i=0;i<5;i++)
            a.add((double) sc.nextInt());
        System.out.println("Введите карты 2-ого игрока");
        for(int i=0;i<5;i++)
            b.add((double) sc.nextInt());
        Collections.reverse(a);
        Collections.reverse(b);
        boolean fin=false;
        int count=0;
        for (int i=0;i<106;i++) {
            count++;
            if (a.get(0) == 0 && b.get(0) == 9) {
                a.add(a.get(0));
                a.add(b.get(0));
            } else if (a.get(0) == 9 && b.get(0) == 0) {
                b.add(a.get(0));
                b.add(b.get(0));
            }
            else if(a.get(0) > b.get(0))
            {
                a.add(a.get(0));
                a.add(b.get(0));
            }
            if(a.get(0) < b.get(0))
            {
                b.add(a.get(0));
                b.add(b.get(0));
            }
            a.remove(0);
            b.remove(0);
          //  System.out.println(a);
          //  System.out.println(b);
            if (a.isEmpty()) {
                System.out.println("Second "+count);
                fin = true;
                break;
            }
            if (b.isEmpty()) {
                System.out.println("First "+count);
                fin = true;
                break;
            }
        }
        if(!fin)
            System.out.println("botva");
    }
}
