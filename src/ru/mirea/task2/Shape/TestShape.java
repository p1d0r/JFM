package ru.mirea.task2.Shape;

import ru.mirea.task2.Shape.Shape;

public class TestShape {
    public static void main(String []args)
    {
        Shape sh1=new Shape("Прямоугольник");
        System.out.println(sh1.toString());
        sh1.setShapeName("Окружность");
        System.out.println(sh1.toString());
        sh1.setShapeName("Треугольник");
        System.out.println(sh1.toString());
    }
}
