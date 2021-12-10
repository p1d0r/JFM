package ru.mirea.task14.opt5;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Task extends JFrame {
    int count;
    Deque<Integer> a = new ArrayDeque<>();
    Deque<Integer> b = new ArrayDeque<>();
    JButton tryButton = new JButton("Добавить");
    JLabel message = new JLabel("Введите 5 карт 1-ого игрока");
    JLabel title = new JLabel("Пьяница");
    JTextField field = new JTextField(10);

    public static String game(Deque<Integer> a,Deque<Integer>b)
    {
        int count = 0;
        for (int i = 0; i < 106; i++) {
            count++;
            if (a.element() == 0 && b.element() == 9) {
                a.addLast(a.element());
                a.addLast(b.element());
            } else if (a.element() == 9 && b.element() == 0) {
                b.addLast(a.element());
                b.addLast(b.element());
            } else if (a.element() > b.element()) {
                a.addLast(a.element());
                a.addLast(b.element());
            }
            if (a.element() < b.element()) {
                b.addLast(a.element());
                b.addLast(b.element());
            }
            a.remove();
            b.remove();
            System.out.println(a);
            System.out.println(b);
            if (a.isEmpty()) {
                return ("Second " + count);
            }
            if (b.isEmpty()) {
                return ("First " + count);
            }
        }
            return ("botva");
    }
    Task() {
        super("Window");
        count = 0;
        GridBagLayout gridBagLayout = new GridBagLayout();
        Container container = getContentPane();
        GridBagConstraints constraints = new GridBagConstraints();
        container.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        setLayout(gridBagLayout);
        constraints.fill = GridBagConstraints.VERTICAL;
        setSize(400, 200);
        constraints.gridy = 0;
        constraints.weightx = 1;
        constraints.weighty = 1;
        constraints.gridx = 1;
        title.setForeground(Color.red);
        container.add(title, constraints);
        constraints.gridy = 1;
        container.add(message, constraints);
        constraints.gridy = 2;
        container.add(tryButton, constraints);
        constraints.gridy = 3;
        container.add(field, constraints);
        tryButton.addActionListener(ae -> {
            int number;
                if(count<10) {
                    try{
                        number = Integer.parseInt(field.getText().trim());
                        field.setText("");
                        count++;
                        if (count == 5)
                            message.setText("Введите 5 карт 2-ого игрока");
                        if (count <= 5)
                            a.addFirst(number);
                        else
                            b.addFirst(number);
                        if(count==10)
                        {
                            field.setVisible(false);
                            message.setText("Рассчитайте игру");
                            tryButton.setText("Рассчитать игру");
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Введите целочисленное число");
                    }
                }
                else {
                    tryButton.setVisible(false);
                    message.setText("Итог игры:"+game(a,b));
                }



        });
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Task();

    }
}

