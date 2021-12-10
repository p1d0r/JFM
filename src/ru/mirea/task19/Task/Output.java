package ru.mirea.task19.Task;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Output {
    public static double output(double summ,double bill)
    {
        try
        {
           summ-=bill;
           if(summ<0)
               throw new Exception();
        }
        catch (Exception e)
        {
            System.out.println("Ошибка, вы не можете снять больше, чем у вас на счету");
            return summ+bill;
        }
        return summ;
    }
    public static void main(String []args)
    {
        double summ,bill;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите кол-во денег на счету, а также кол-во денег, которые хотите снять");
        try
        {
            summ=scanner.nextDouble();
            bill=scanner.nextDouble();
            if(summ<0 || bill<0)
                throw new Exception();
        }
        catch (Exception e)
        {
            System.out.println("Ошибка ввода");
            return;
        }
        summ=Output.output(summ,bill);
        System.out.println(summ);
    }
}
