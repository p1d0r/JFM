package ru.mirea.task13.opt3;

import java.util.Arrays;
import java.util.function.Predicate;

public class ArrayList {
    private Object a[];
    public ArrayList(){a=new Object[1];}
    public ArrayList(int n){a=new Object[n+1];};
    public void add(Object value)
    {
        a[a.length-1] = value;
        a = Arrays.copyOf(a, a.length + 1);
    }
    public void remove(int index)
    {
        for(int i=index;i<a.length-1;i++)
            a[i]=a[i+1];
        a = Arrays.copyOf(a, a.length - 1);
    }
    public boolean contains(Object value)
    {
        for(int i=0;i<a.length-1;i++)
            if(a[i]==value)
                return true;
        return false;
    }
    public void removeIf(Predicate filter)
    {
        boolean f=true;
        while (f)
        {
            f=false;
            for(int i=0;i<a.length-1;i++)
                if(filter.test(a[i]))
                {
                    remove(i);
                    f=true;
                    break;
                }
        }
    }
    public void clear()
    {
        int b=a.length-1;
        for(int i=0;i<b;i++)
            remove(0);
    }
    public String toString()
    {
        if(a.length!=1) {
            String str = "[";
            for (int i = 0; i < a.length - 2; i++)
                str += a[i] + ", ";
            str += a[a.length - 2] + "]";
            return str;
        }
        else return "[]";
    }
}
