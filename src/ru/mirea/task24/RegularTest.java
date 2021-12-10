package ru.mirea.task24;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularTest {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Для регистрации нового аккаунта придумайте логин и пароль ");
        Pattern passPattern=Pattern.compile("^[A-Za-z0-9]+$");
        Pattern logPattern=Pattern.compile("^[A-Za-z0-9]+$");
        String login,password;
        while(true) {
            login = sc.next();
            password = sc.next();
            Matcher pasmatcher = passPattern.matcher(password);
            Matcher logmatcher = logPattern.matcher(login);
            if(!logmatcher.matches())
                System.out.println("Ошибка ввода: в логине могут быть только символы латинского алфавита и цифры");
            else if(!pasmatcher.matches())
                System.out.println("Ошибка ввода: в пароле могут быть только символы латинского алфавита и цифры");
            else break;
        }
        System.out.println("Вы успешно ввели логин и пароль");
    }
}
