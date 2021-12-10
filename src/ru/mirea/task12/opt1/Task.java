package ru.mirea.task12.opt1;

public class Task {
    public static void main(String []args)
    {
        Student[] iDNumber=new Student[20];
        for (int i=0;i<20;i++) {
            iDNumber[i] = new Student((int) (Math.random() * 100));
            System.out.print(iDNumber[i].getId()+" ");
        }

        for (int i=0;i<20;i++)
        {
            Student temp=iDNumber[i];
            int j=i-1;
            for (;j>=0;j--)
                if (temp.getId() < iDNumber[j].getId())
                    iDNumber[j + 1] = iDNumber[j];
                else break;
            iDNumber[j+1]=temp;
        }
        System.out.println();
        for (int i=0;i<20;i++)
            System.out.print(iDNumber[i].getId()+" ");
    }
}
