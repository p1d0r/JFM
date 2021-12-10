package ru.mirea.task17.Task;

import java.util.Scanner;

enum Users{
    Client,Worker,Director,None
}
public class UsersEnum {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        Users[] id=new Users[5];
        id[0]=Users.None;
        id[1]=Users.Director;
        id[2]=Users.Worker;
        id[3]=Users.Client;
        id[4]=Users.None;
        while(true)
        {
            System.out.println("Введите id пользователя");
            int enterID=scanner.nextInt();
            switch (id[enterID]) {
                case Client -> System.out.println("Пользователь является клиентом банка");
                case Worker -> System.out.println("Пользователь является работником банка");
                case Director -> System.out.println("Пользователь является директором банка");
                case None -> System.out.println("Пользователь не зарегистрирован");
            }
        }
    }
}
