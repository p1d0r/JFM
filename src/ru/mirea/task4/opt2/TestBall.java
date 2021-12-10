package ru.mirea.task4.opt2;

import ru.mirea.task4.opt2.Ball;

public class TestBall {
    public static void main(String[] args)
    {
        Ball ball=new Ball();
        ball.move(5,-5);
        System.out.println(ball);
        ball.setXY(1,1);
        System.out.println(ball);
        ball.setX(0);
        ball.setY(0);
        System.out.println(ball);
    }
}
