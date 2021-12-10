package ru.mirea.task27;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[]args)
    {
        HashMap<String,String> people=new HashMap<>();
        people.put("Иванов","Илья");
        people.put("Зубцов","Андрей");
        people.put("Петров","Иван");
        people.put("Маслов","Денис");
        people.put("Жуков","Вадим");
        people.put("Гурьянов","Владимир");
        people.put("Степунин","Иван");
        people.put("Городсков","Николай");
        people.put("Авдоничев","Илья");
        people.put("Лушин","Денис");
        System.out.println(people);

        HashMap<String,Integer> count=new HashMap<>();
        for(Map.Entry<String,String>entry: people.entrySet())
            if(count.containsKey(entry.getValue()))
                count.put(entry.getValue(),count.get(entry.getValue())+1);
            else
                count.put(entry.getValue(),1);

        for(Map.Entry<String,String> entry: new HashMap<>(people).entrySet())
            if(count.get(entry.getValue())>1)
                people.remove(entry.getKey());

        System.out.println(people);
    }
}
