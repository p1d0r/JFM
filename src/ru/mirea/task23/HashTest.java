package ru.mirea.task23;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HashTest {
    List<Client> clientList= new ArrayList<>();
    public boolean checkEnter(String login,String password)
    {
        for (int i=0;i<5;i++)
        {
            if(login.hashCode()==clientList.get(i).getLogin().hashCode()&&
                    password.hashCode()==clientList.get(i).getPassword().hashCode())
                return true;
        }
        return false;
    }
    public static void main(String[]args)
    {
        HashTest hashTest=new HashTest();
        hashTest.clientList.add(new Client("krutoi","123321"));
        hashTest.clientList.add(new Client("Deni","Пароль11"));
        hashTest.clientList.add(new Client("Nesqwick","Надежный пароль"));
        hashTest.clientList.add(new Client("Fearse","Четыре"));
        hashTest.clientList.add(new Client("Bss","))))"));
        System.out.println("Clients:");
        for (int i=0;i<5;i++)
            System.out.println(hashTest.clientList.get(i).toString());
        Scanner sc=new Scanner(System.in);
        String login,password;
        System.out.println("Введите логин и пароль");
        login=sc.next();
        password=sc.next();
        while(!hashTest.checkEnter(login,password))
        {
            System.out.println("Ошибка, вы ввели неправильный логин или пароль");
            login=sc.next();
            password=sc.next();
        }
        System.out.println("Вы успешно вошли в свой акааунт");
    }
}
