package ru.mirea.task1.opt4;

import java.util.Random;

public class Task {
    public static void main(String[] args){

        int[] a = new int [1+(int)(Math.random()*10)];//Генерация чисел через метод random класса Math
        for(int i = 0; i< a.length;i++)
        {
            a[i] = (int)(Math.random()*100);
            System.out.print(a[i]+" ");
        }
       /* Random random=new Random(); //Способ генерации чисел через класс Random
        int[] a=new int [random.nextInt(10)];
        for (int i=0;i<a.length;i++)
        {
            a[i]= random.nextInt(100);
            System.out.print(a[i]+" ");
        }*/
        for (int i=0;i<a.length;i++)
            for (int j=0;j<a.length-1;j++)
                if(a[i]<a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
        System.out.println();
        for (int j : a) System.out.print(j + " ");
    }
}