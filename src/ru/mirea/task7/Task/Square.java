package ru.mirea.task7.Task;

public class Square extends Rectangle{
    public Square() {
    }

    public Square(double side) {
        length=side;
    }

    public Square(double side, String color, boolean filled) {
        width=side;
        length=side;
        this.color=color;
        this.filled=filled;
    }

    public double getSide()
    {
        return length;
    }

    public void setSide(double side)
    {
        length=side;
        width=side;
    }
    public void setWidth(double side) //возможно исправить setWidth и setLength
    {
        width=side;
        length=side;
    }
    public void setLength(double side)
    {
        length=side;
        width=side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
