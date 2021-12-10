package ru.mirea.task12.opt2;

import java.util.ArrayList;
import java.util.Collections;

public class Task {
    public static void main(String []args)
    {
        ArrayList<Student>iDNumber=new ArrayList<>();
        for (int i=0;i<20;i++) {
            iDNumber.add(new Student((int) (Math.random() * 100),(int)(Math.random()*100)));
            System.out.print(iDNumber.get(i).getBall()+" ");
        }
        Collections.sort(iDNumber,new SortingStudentsByGPA());
        System.out.println();
        for (int i=0;i<20;i++)
            System.out.print(iDNumber.get(i).getBall()+" ");
    }
}
