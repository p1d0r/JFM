package ru.mirea.task9;

import javax.swing.*;
import java.awt.*;

public class Task extends JFrame {
    int muc=0,morc=0;
    JButton muButton=new JButton("MU");
    JButton morButton=new JButton("FC Mordovia");
    JLabel lastSc=new JLabel("Last Scorer: N/A");
    JLabel score=new JLabel("Result: 0X0");
    Label result=new Label("Winner: Draw");
    void checkResult()
    {
        if (morc>muc)
            result.setText("Winner: FC Mordovia");
        else if (muc>morc)
            result.setText("Winner: Manchester United");
        else result.setText("Winner: Draw");
    }
    Task()
    {
        super("Window");

        GridBagLayout gridBagLayout=new GridBagLayout();
        Container container=getContentPane();
        GridBagConstraints constraints=new GridBagConstraints();
        container.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        setLayout(gridBagLayout);
        setSize(500,200);
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.ipady=45;
        constraints.weightx = 0.5;
        constraints.gridy   = 0  ;
        constraints.gridx = 0;
        container.add(morButton, constraints);

        constraints.ipady=0;
        constraints.weightx = 1;
        constraints.gridy   = 0  ;
        constraints.gridx = 1;
        constraints.fill=GridBagConstraints.CENTER;
        container.add(score, constraints);

        constraints.gridy   =  1 ;
        constraints.gridx = 1;
        container.add(lastSc, constraints);

        constraints.ipady=45;
        constraints.weightx = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridy   =  0 ;
        constraints.gridx = 2;
        container.add(muButton, constraints);

        constraints.ipady=0;
        constraints.weightx = 1;
        constraints.gridheight = 1;
        constraints.fill=GridBagConstraints.CENTER;
        constraints.gridy   =  3 ;
        constraints.gridx   =  1 ;
        container.add(result, constraints);
        result.setForeground(Color.red);
        morButton.addActionListener(ae -> {
            morc++;
            score.setText("Result: "+morc+"X"+muc);
            lastSc.setText("Last Scorer: FC Mordovia");
            checkResult();
        });
        muButton.addActionListener(ae -> {
            muc++;
            score.setText("Result: "+morc+"X"+muc);
            lastSc.setText("Last Scorer: Manchester United");
            checkResult();
        });
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String []args)
    {
        new Task();
    }
}

