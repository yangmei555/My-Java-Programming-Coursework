package _07blackjack.blackjack;

import javafx.geometry.VerticalDirection;
import javafx.scene.control.cell.TextFieldListCell;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Random;

/**
 * Created by yangmei555 on 2016/11/11.
 */
public class BlackJackFrame extends JFrame{
    private static final int FRAME_WIDTH = 1200;
    private static final int FRAME_HEIGHT = 1200;
    private static final int AREA_ROWS = 10;
    private static final int AREA_COLUMNS = 30;
    private static final int COMPONENT_WIDTH = 300;
    private static final int COMPONENT_HEIGHT = 300;

    private JPanel panel_n, panel_c, panel_s, panel_e, panel_w;
    private JButton hit, stand, bet_commit, reload, restart;
    private JLabel playerLabel, computerLabel, resultLabel, bet_input_label, moneyLabel;
    private JLabel bet_amount_label, reload_label;
    private JLabel[] decks_label;
    private JTextField betField;
    private JTextArea result_area;
    private Random random = new Random();
    private int player_point, computer_point, player_money, bet_amount;
    private int player_card_amount, computer_card_amount;
    private int[] decks_amount;
    private Image image = null;
    private JComponent component;

    public BlackJackFrame(){
        createPanel_n();
        createPanel_c();
        createPanel_s();
        createPanel_e();
        createPanel_w();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

    public void createPanel_n(){
        panel_n = new JPanel();
        computerLabel = new JLabel("Computer Point: " + computer_point);
        panel_n.setLayout(new GridLayout(1, 10));
        panel_n.add(computerLabel);
//        component = new JComponent() {
//            @Override
//            protected void paintComponent(Graphics g) {
//                super.paintComponent(g);
//                Image image = null;
//                try {
//                    image = ImageIO.read(new File("src\\_07blackjack\\blackjack\\pictures\\3.jpg"));
//                } catch (IOException e){
//                    e.printStackTrace();
//                }
//                g.drawImage(image, 0, 0, null);
//            }
//        };
//        component.setPreferredSize(new Dimension(COMPONENT_WIDTH, COMPONENT_HEIGHT));
//        panel_n.add(component);


        //addPicture(1, 4);
        add(panel_n, BorderLayout.NORTH);
    }

    public void createPanel_s(){
        panel_s = new JPanel();
        playerLabel = new JLabel("Play Point: " + player_point);
        panel_s.setLayout(new GridLayout(1, 10));
        panel_s.add(playerLabel);
//        component = new JComponent() {
//            @Override
//            protected void paintComponent(Graphics g) {
//                super.paintComponent(g);
//                Image image = null;
//                try {
//                    image = ImageIO.read(new File("src\\_07blackjack\\blackjack\\pictures\\3.jpg"));
//                } catch (IOException e){
//                    e.printStackTrace();
//                }
//                g.drawImage(image, 0, 0, null);
//            }
//        };
//        component.setPreferredSize(new Dimension(COMPONENT_WIDTH, COMPONENT_HEIGHT));
//        panel_n.add(component);



        add(panel_s, BorderLayout.SOUTH);
    }

    public void createPanel_w(){
        panel_w = new JPanel();
        panel_w.setLayout(new GridLayout(10, 1));
        resultLabel = new JLabel("Result: no result");
        bet_input_label = new JLabel("Please input your bet amount:");
        betField = new JTextField();
        bet_amount_label  =new JLabel("Your bet amount is: " + bet_amount);
        player_money = 1000;
        moneyLabel = new JLabel("Your have $" + player_money);
        bet_commit = new JButton("Bet");
        bet_commit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = betField.getText();
                try {
                    bet_amount = Integer.parseInt(str);
                } catch (NumberFormatException ee) {
                    //ee.printStackTrace();
                    System.out.println("Your input is wrong, please input an integer!");
                    bet_amount_label.setText("");
                }
                bet_amount_label.setText("Your bet amount is: " + bet_amount);
            }
        });
        panel_w.add(resultLabel);
        panel_w.add(bet_input_label);
        panel_w.add(betField);
        panel_w.add(bet_commit);
        panel_w.add(bet_amount_label);
        panel_w.add(moneyLabel);

        hit = new JButton("Hit!");
        stand = new JButton("Stand!");
        reload = new JButton("Reload the cards");
        reload_label = new JLabel("The cards run out, please reload!");
        reload.setVisible(false);
        reload_label.setVisible(false);

        computer_card_amount = 1;
        hit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("haha");
                addPicture(5, 4);
            }
        });

        panel_w.add(hit);
        panel_w.add(stand);
        panel_w.add(reload_label);
        panel_w.add(reload);

        add(panel_w, BorderLayout.WEST);
    }

    public void createPanel_c(){
        panel_c = new JPanel();
        panel_c.setLayout(new GridLayout(2, 6));
        decks_amount = new int[6];
        decks_label = new JLabel[6];
        int i = 0;
        for (int j = 0; j < 6; j++)
            decks_amount[j] = 52;
        for (JLabel label : decks_label) {
            label = new JLabel();
            label.setText("Deck " + (i + 1) + " remains: " + decks_amount[i] + " cards");
            i++;
            panel_c.add(label);
        }
        for (i = 0; i < 6; i++)
            addPicture(3, 53);


        add(panel_c, BorderLayout.CENTER);
    }


    public void createPanel_e(){
        panel_e = new JPanel();
        restart = new JButton("Restart");
        panel_e.setLayout(new GridLayout(4, 1));
        //panel_e.setLayout(new Verr);
        result_area = new JTextArea(AREA_ROWS, AREA_COLUMNS);
        result_area.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(result_area);
        panel_e.add(scrollPane);
        panel_e.add(restart);
        add(panel_e, BorderLayout.EAST);
    }



    public void addPicture(int i, int n){
        String str;
        if (n == 53)
            str = n + ".png";
        else
            str = n + ".jpg";
        component = new JComponent() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Image image = null;
                try {
                    image = ImageIO.read(new File("src\\_07blackjack\\blackjack\\" +
                            "pictures\\" + str));
                } catch (IOException e){
                    e.printStackTrace();
                }
                g.drawImage(image, 0, 0, null);
            }
        };
        component.setPreferredSize(new Dimension(COMPONENT_WIDTH, COMPONENT_HEIGHT));
        if (i == 1)
            panel_n.add(component);
        else if (i == 2)
            panel_w.add(component);
        else if (i == 3)
            panel_c.add(component);
        else if (i == 4)
            panel_e.add(component);
        else if (i == 5)
            panel_s.add(component);
        //panel_n.remove(component);
    }

    public void addPicture(int i, int n, boolean flag){
        if (flag) {
            String str;
            if (n == 53)
                str = n + ".png";
            else
                str = n + ".jpg";
            component = new JComponent() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    Image image = null;
                    try {
                        image = ImageIO.read(new File("src\\_07blackjack\\blackjack\\" +
                                "pictures\\" + str));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    g.drawImage(image, 0, 0, null);
                }
            };
            component.setPreferredSize(new Dimension(COMPONENT_WIDTH, COMPONENT_HEIGHT));
            if (i == 1)
                panel_n.add(component);
            else if (i == 2)
                panel_w.add(component);
            else if (i == 3)
                panel_c.add(component);
            else if (i == 4)
                panel_e.add(component);
            else if (i == 5)
                panel_s.add(component);
            //panel_n.remove(component);
        } else {
            if (i == 1)
                panel_n.remove(component);
            else if (i == 2)
                panel_w.remove(component);
            else if (i == 3)
                panel_c.remove(component);
            else if (i == 4)
                panel_e.remove(component);
            else if (i == 5)
                panel_s.remove(component);
            //panel_n.remove(component);
        }
    }
}
