package ru.mirea.task2.Ball;

import ru.mirea.task2.Ball.Ball;

public class TestBall {
    public static void main(String [] args)
    {
        Ball ball=new Ball("Футбольный","Красный","Стандартный");
        System.out.println(ball);
        ball.setType("Баскетбольный");
        ball.setColor("Оранжевый");
        ball.setSize("Очень большой");
        System.out.println(ball);
    }
}
