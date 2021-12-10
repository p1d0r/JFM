package ru.mirea.task15.opt3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task {
    public static void main(String[]args)
    {
        try(FileWriter writer = new FileWriter("task15.txt"))
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