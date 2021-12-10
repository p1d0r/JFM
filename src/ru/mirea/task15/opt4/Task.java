package ru.mirea.task15.opt4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task {
    public static void main(String[]args)
    {
        try(FileWriter writer = new FileWriter("task15.txt",true))
        {
            Scanner sc=new Scanner(System.in);
            writer.write(sc.nextLine());
            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
