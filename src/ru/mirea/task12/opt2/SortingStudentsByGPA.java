package ru.mirea.task12.opt2;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        if(a.getBall()>b.getBall())
            return -1;
        if(a.getBall()<b.getBall())
            return 1;
        return 0;
    }
}
