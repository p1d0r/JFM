package ru.mirea.task20.Task;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class TestTime {
    Date date=new Date();
    public String getTime(String zone) {
        TimeZone timeZone = TimeZone.getTimeZone(zone);
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss dd-MM-yyyy");
        dateFormat.setTimeZone(timeZone);
        return dateFormat.format(date);
    }
    public static void main(String[] args){
        TestTime test=new TestTime();
        User testClient=new User("Test","User","123","Europe/Moscow");
        System.out.println("Введите логин и пароль для входа:");
        String pass,login;
        Scanner sc=new Scanner(System.in);
        login=sc.next();
        pass=sc.next();
        if (testClient.checkLogin(login)&&testClient.checkPassword(pass))
        {
            System.out.println("Вход выполнен ("+test.getTime(testClient.getZone())+")");
            System.out.println("Чтобы выйти из личного кабинета введите 0");
            testClient.setZone("Asia/Vladivostok");
            if(sc.nextInt()==0)
                System.out.println("Вы вышли из учетной записи (" + test.getTime(testClient.getZone())+")");
        }
        else
        {
         System.out.println("Ошибка входа");
        }
    }
}
