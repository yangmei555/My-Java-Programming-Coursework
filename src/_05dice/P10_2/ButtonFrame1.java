package _05dice.P10_2;

import _04interfaces.P9_8.Student;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Arc2D;

/**
 * Created by yangmei555 on 2016/10/28.
 */
public class ButtonFrame1 extends JFrame {
    private static final int frame_width = 100;
    private static final int frame_height = 60;
    private int n = 1;

    public ButtonFrame1() {
        createComponents();
        setSize(frame_width, frame_height);
    }
    public void createComponents(){
        JButton button = new JButton("Click me!");
        JPanel panel = new JPanel();
        panel.add(button);
        add(panel);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("I was clicked " + n + " times!");
                n++;
            }
        });
    }

}