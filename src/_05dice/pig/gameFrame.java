package _05dice.pig;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * Created by yangmei555 on 2016/10/30.
 */
public class gameFrame extends JFrame {
    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 500;

    private JLabel userlabel, computerlabel, resultlabel;
    private JButton userroll, userhold, computerroll, restart;
    private JTextArea userarea, computerarea;
    private JPanel panel;
    private static final int AREA_ROWS = 10;
    private static final int AREA_COLUMNS = 30;

    private Random ra = new Random();

    private int userscore, useroneturnscore, computerscore, computeroneturnscore, usercurrent, computercurrent;
    public gameFrame(){
        createTextArea();
        createButton();
        createPanel();

        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }
    public void createTextArea(){
        userarea = new JTextArea(AREA_ROWS, AREA_COLUMNS);
        computerarea = new JTextArea(AREA_ROWS, AREA_COLUMNS);

        userarea.setEditable(false);
        computerarea.setEditable(false);
    }
    public void createButton(){
        resultlabel = new JLabel("The result of the game");
        userlabel = new JLabel("What the user rolls");
        computerlabel = new JLabel("What the computer rolls");
        userroll = new JButton("User rolls");
        userroll.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                usercurrent = ra.nextInt(6) + 1;
                userlabel.setText(usercurrent + "");
                if (usercurrent == 1) {
                    userarea.append(userscore + "\n");
                    useroneturnscore = 0;
                }
                else
                    useroneturnscore += usercurrent;
            }
        });
        userhold = new JButton("User holds");
        userhold.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userscore += useroneturnscore;
                useroneturnscore = 0;
                userarea.append(userscore + "\n");
                if (userscore >= 100) {
                    resultlabel.setText("Game over. The user win!!!");
                    userarea.append("\n");
                    computerarea.append("\n");
                }
            }
        });
        computerroll = new JButton("Computer rolls");
        computerroll.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int times = ra.nextInt(10) + 1;
                int i;
                //System.out.println(times);
                for (i = 0; i < times; i++){
                    computercurrent = ra.nextInt(6) + 1;
                    computerlabel.setText(computercurrent + "");
                    if (computercurrent == 1) {
                        computerarea.append(computerscore + "\n");
                        computeroneturnscore = 0;
                        break;
                    }
                    else
                        computeroneturnscore += computercurrent;
                }
                if (i == times) {
                    computerscore += computeroneturnscore;
                    computeroneturnscore = 0;
                    computerarea.append(computerscore + "\n");
                    if (computerscore >= 100) {
                        resultlabel.setText("Game over. The computer win!!!");
                        userarea.append("\n");
                        computerarea.append("\n");
                    }
                }
            }
        });
        restart = new JButton("Restart");
        restart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userscore = 0;
                computerscore = 0;
                useroneturnscore = 0;
                computeroneturnscore = 0;
                userarea.append("\n");
                computerarea.append("\n");
            }
        });
    }
    public void createPanel(){
        panel = new JPanel();
        panel.add(userlabel);
        panel.add(userroll);
        panel.add(userhold);
        JScrollPane scrollPane = new JScrollPane(userarea);
        panel.add(scrollPane);

        panel.add(computerlabel);
        panel.add(computerroll);
        JScrollPane scrollPane2 = new JScrollPane(computerarea);
        panel.add(scrollPane2);

        panel.add(resultlabel);
        panel.add(restart);
        add(panel);
    }
}
