package ru.mirea.task28;

public class Car {
    private String mark,model;
    private String type;
    private Engine engine=new Engine();
    private Doors doors=new Doors();
    int speed,numberOfWheels,numberOfPassengers;

    public Car(String mark, String model) {
        this.mark = mark;
        this.model = model;
    }
    public void shoot()
    {
        System.out.println("Обычная машина не может стрелять ");
    }
    public Car() {
    }
    public void moveForw()
    {
        System.out.println("Вы движетесь вперед");
    }
    public void moveBack()
    {
        System.out.println("Вы движетесь назад");
    }
    public void moveLeft()
    {
        System.out.println("Вы движетесь влево");
    }
    public void moveRight()
    {
        System.out.println("Вы движетесь вправо");
    }
    public void changeSpeed(int speed)
    {
     this.speed=speed;
    }
    class Engine
    {
        int hp;

        public int getHp() {
            return hp;
        }

        public void setHp(int hp) {
            this.hp = hp;
        }

        void start()
        {
            System.out.println("Engine started");
        }
        void stop()
        {
            System.out.println("Engine stopped");
        }
    }
    class Doors {
        Window window=new Window();
        boolean is_open;
        public void open()
        {
            is_open=true;
        }
        public void close()
        {
            is_open=false;
        }
        boolean getStatus()
        {
            return is_open;
        }
    }
    class Window
    {
        boolean is_open;
        public void open()
        {
            is_open=true;
        }
        public void close()
        {
            is_open=false;
        }
        boolean getStatus()
        {
            return is_open;
        }
    }
    private class tank extends Car
    {
        String type="Military";

        public tank() {
        }

        @Override
        public void shoot()
        {
            System.out.println("Вы успешно выстрелили ");
        }

    }
    public static void main(String[]args)
    {
        Car normal=new Car("Volkswagen","Polo");
        Car tank=new Car().new tank();
        normal.shoot();
        tank.shoot();
    }
}
