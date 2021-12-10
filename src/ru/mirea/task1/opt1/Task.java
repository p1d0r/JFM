package ru.mirea.task1.opt1;
import java.util.Scanner;

public class Task {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int[]a=new int[10];
        System.out.println("Введите элементы массива");
        for (int i=0;i<10;i++)
            a[i]=sc.nextInt();

        System.out.print("For:");
        for (int i=0;i<10;i++)
            System.out.print(" "+a[i]+" ");

        System.out.print("\n"+"While:");
        int i=0;
        while (i<10)
        {
            System.out.print(" "+a[i]+" ");
            i++;
        }
        System.out.print("\n"+"Do While:");
        i=0;
        do {
            System.out.print(" "+a[i]+" ");
            i++;
        } while (i<9);
    }
}
