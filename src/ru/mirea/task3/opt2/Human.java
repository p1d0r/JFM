package ru.mirea.task3.opt2;

public class Human {
    private String name;
    private Head head=new Head();
    private Leg legs=new Leg();
    private Hand hands=new Hand();
    private  Body body=new Body();
    public Human(String name) {
        this.name = name;
        head.setHealth((int) (Math.random()*100));
        body.setHealth((int) (Math.random()*100));
        legs.setHealth((int) (Math.random()*100));
        hands.setHealth((int) (Math.random()*100));
    }
    public String getName(){return name;}
    public String getStatistic()
    {
        return "Человек по имени: "+getName()+"\n"+"Его здоровье(в процентах):"+"\n"+"Руки: "+hands.getHealth()+"\n"+"Ноги: "+legs.getHealth()
               +"\n"+"Голова: "+head.getHealth()+"\n"+"Тело: "+body.getHealth();
    }
}
