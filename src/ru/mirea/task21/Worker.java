package ru.mirea.task21;

public class Worker {
    String name;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", id=" + id +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Worker(String name, String password, int id) {
        this.name = name;
        this.password = password;
        this.id = id;
    }

    String password;
    int id;

}
