package _05dice.P10_35;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by yangmei555 on 2016/10/30.
 */
public class BillFrame extends JFrame {
    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 500;

    private static final int AREA_ROWS = 10;
    private static final int AREA_COLUMNS = 30;

    private JLabel[] userLabel;
    private JTextField[] inputField;
    private JButton[] button;
    private JButton add;
    private JButton check;
    private JTextArea billArea;

    private double subtotal;
    private double tax;
    private double overall;
    private double tips;

    public BillFrame(){
        createBillArea();
        createTextField();
        createButton();
        createPanel();

        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }
    public void createBillArea(){
        billArea = new JTextArea(AREA_ROWS, AREA_COLUMNS);
        billArea.setEditable(false);
    }
    public void createTextField(){
        userLabel = new JLabel[2];
        userLabel[0] = new JLabel("Enter item: ");
        userLabel[1] = new JLabel("Enter price: ");
        final int FIELD_WIDTH = 10;
        inputField = new JTextField[2];
        inputField[0] = new JTextField(FIELD_WIDTH);
        inputField[1] = new JTextField(FIELD_WIDTH);

    }
    public void createButton(){
        button = new JButton[10];
        button[0] = new JButton("Noodles, 10$");
        button[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                subtotal += 10;
                billArea.append("Noodles" + "   " + "10$" + "\n");
            }
        });
        button[1] = new JButton("Rice, 12$");
        button[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                subtotal += 12;
                billArea.append("Rice" + "   " + "12$" + "\n");
            }
        });
        button[2] = new JButton("Beef, 7$");
        button[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                subtotal += 7;
                billArea.append("Beef" + "   " + "7$" + "\n");
            }
        });
        button[3] = new JButton("Fish, 9$");
        button[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                subtotal += 9;
                billArea.append("Fish" + "   " + "9$" + "\n");
            }
        });
        button[4] = new JButton("Chicken, 8$");
        button[4].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                subtotal += 8;
                billArea.append("Chicken" + "   " + "8$" + "\n");
            }
        });
        button[5] = new JButton("Pork, 6$");
        button[5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                subtotal += 6;
                billArea.append("Pork" + "   " + "6$" + "\n");
            }
        });
        button[6] = new JButton("Break, 5$");
        button[6].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                subtotal += 5;
                billArea.append("Bread" + "   " + "5$" + "\n");
            }
        });
        button[7] = new JButton("Samosa, 2$");
        button[7].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                subtotal += 2;
                billArea.append("Samosa" + "   " + "2$" + "\n");
            }
        });
        button[8] = new JButton("Sandwich, 6$");
        button[8].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                subtotal += 6;
                billArea.append("Sandwich" + "   " + "6$" + "\n");
            }
        });
        button[9] = new JButton("Omelet, 6$");
        button[9].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                subtotal += 6;
                billArea.append("Omelet" + "   " + "6$" + "\n");
            }
        });
        add = new JButton("Add to bill");
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str1 = inputField[0].getText();
                String str2 = inputField[1].getText();
                double dou = Double.parseDouble(str2);
                subtotal += dou;
                billArea.append(str1 + "   " + dou + "$" + "\n");
            }
        });
        check = new JButton("Check the bill");
        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tax = subtotal * 0.1;
                overall = tax + subtotal;
                tips = overall * 0.15;
                billArea.append("\n");
                billArea.append("subtotal: " + subtotal + "\n");
                billArea.append("tax: " + tax + "\n");
                billArea.append("overal: " + overall + "\n");
                billArea.append("tips: " + tips + "\n");
                billArea.append("\n");
            }
        });
    }
    public void createPanel(){
        JPanel panel = new JPanel();
        panel.add(userLabel[0]);
        panel.add(inputField[0]);
        panel.add(userLabel[1]);
        panel.add(inputField[1]);
        panel.add(add);
        panel.add(button[0]);
        panel.add(button[1]);
        panel.add(button[2]);
        panel.add(button[3]);
        panel.add(button[4]);
        panel.add(button[5]);
        panel.add(button[6]);
        panel.add(button[7]);
        panel.add(button[8]);
        panel.add(button[9]);
        panel.add(check);
        JScrollPane scrollPane = new JScrollPane(billArea);
        panel.add(scrollPane);
        add(panel);
    }
}
