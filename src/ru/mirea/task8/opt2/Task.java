package ru.mirea.task8.opt2;

import javax.swing.*;

public class Task extends JFrame {
    Task(String s)
    {
        super("Task");
        setSize(633,655);
        JLabel jLabel = new JLabel();
        ImageIcon imageIcon = new ImageIcon(s);
        jLabel.setIcon(imageIcon);
        add(jLabel);
        setVisible(true);
    }
    public static void main(String []args)
    {
        //C:\123.jpg
        new Task(args[0]);
    }
}
