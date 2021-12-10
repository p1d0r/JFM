package ru.mirea.task22;



import java.util.ArrayList;

enum UserType
{
    Client,
    Worker,
    Director
}
public class UserFactory {
    public User createUser(UserType type)
    {
        User user=null;
        switch (type)
        {
            case Client -> user=new Client();
            case Worker -> user=new Worker();
            case Director -> user=new Director();
        }
        return user;
    }
    public static void main(String[]args)
    {
        ArrayList<User> list= new ArrayList<>();
        UserFactory userFactory=new UserFactory();
        list.add(userFactory.createUser(UserType.Client));
        list.add(userFactory.createUser(UserType.Client));
        list.add(userFactory.createUser(UserType.Director));
        list.add(userFactory.createUser(UserType.Worker));
        list.add(userFactory.createUser(UserType.Worker));
        for (User user : list) {
            System.out.println(user.getType());
        }
    }
}
