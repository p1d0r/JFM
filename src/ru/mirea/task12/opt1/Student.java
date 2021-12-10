package ru.mirea.task12.opt1;

public class Student {
    int id;

    public Student( int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id +
                '}';
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
