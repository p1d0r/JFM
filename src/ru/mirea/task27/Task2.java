package ru.mirea.task27;

import java.util.ArrayList;
import java.util.HashMap;

public class Task2 {
    public static void main(String[]args)
    {
        HashMap<String, ArrayList<String>> countries=new HashMap<>();
        HashMap<String,String>cities=new HashMap<>();
        City moscow = new City("Moscow","Russia");
        City st = new City("St. Petersburg","Russia");
        City saransk = new City("Saransk","Russia");
        City manchester=new City("Manchester","UK");
        City liverpool=new City("Liverpool","UK");
        City london=new City("London","UK");
        City kiev=new City("Kiev","Ukraine");
        City kharkov=new City("Kharkov","Ukraine");
        City lviv=new City("Lviv","Ukraine");
        countries.put("Russia",new ArrayList<>());
        countries.get("Russia").add(moscow.getCity());
        countries.get("Russia").add(st.getCity());
        countries.get("Russia").add(saransk.getCity());
        countries.put("UK",new ArrayList<>());
        countries.get("UK").add(london.getCity());
        countries.get("UK").add(liverpool.getCity());
        countries.get("UK").add(manchester.getCity());
        countries.put("Ukraine",new ArrayList<>());
        countries.get("Ukraine").add(kharkov.getCity());
        countries.get("Ukraine").add(kiev.getCity());
        countries.get("Ukraine").add(lviv.getCity());
        System.out.println(countries);
    }
}
