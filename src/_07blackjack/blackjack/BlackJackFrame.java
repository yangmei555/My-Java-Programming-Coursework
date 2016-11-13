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
    private static final int FRAME_WIDTH = 1000;
    private static final int FRAME_HEIGHT = 800;
    private static final int AREA_ROWS = 10;
    private static final int AREA_COLUMNS = 30;
    private static final int COMPONENT_WIDTH = 300;
    private static final int COMPONENT_HEIGHT = 300;

    private JPanel panel_n, panel_c, panel_s, panel_e, panel_w;
    private JButton hit, stand, bet_commit, reload, restart, new_turn;
    private JLabel playerLabel, computerLabel, resultLabel, bet_input_label, moneyLabel;
    private JLabel bet_amount_label, reload_label, notice_label;
    private JLabel[] decks_label, decks_common;
    private JTextField betField;
    private JTextArea result_area;
    private Random random = new Random();
    private int player_point, computer_point, player_money, bet_amount;
    private int player_card_amount, computer_card_amount, player_soft, computer_soft ;
    private int computer_n1_1, computer_n2_1, computer_n1_2, computer_n2_2;
    private int[] decks_amount;
    private int[][] decks_value;
    private Image image = null;
    private JComponent component;
    private boolean begin;

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

        panel_n.setPreferredSize(new Dimension(800, 160));

        add(panel_n, BorderLayout.NORTH);
        //add(panel_n);
    }

    public void createPanel_s(){
        panel_s = new JPanel();
        playerLabel = new JLabel("Player Point: " + player_point);
        panel_s.setLayout(new GridLayout(1, 10));
        panel_s.add(playerLabel);

        panel_s.setPreferredSize(new Dimension(800, 160));
        add(panel_s, BorderLayout.SOUTH);
        //add(panel_s);
    }

    public void createPanel_w(){
        panel_w = new JPanel();
        panel_w.setLayout(new GridLayout(10, 1));
        resultLabel = new JLabel("Result: no result");
        bet_input_label = new JLabel("Please input your bet amount:");
        betField = new JTextField();
        bet_amount_label = new JLabel("Your bet amount is: $" + bet_amount);
        player_money = 1000;
        moneyLabel = new JLabel("Your have $" + player_money);

        panel_w.add(resultLabel);
        panel_w.add(bet_input_label);
        panel_w.add(betField);
        panel_w.add(bet_amount_label);
        panel_w.add(moneyLabel);

        notice_label = new JLabel("Notice");
        new_turn = new JButton("Begin a new turn!");
        hit = new JButton("Hit!");
        stand = new JButton("Stand!");
        reload = new JButton("Reload the cards");

        panel_w.add(new_turn);
        panel_w.add(hit);
        panel_w.add(stand);
        panel_w.add(notice_label);
        panel_w.add(reload);


        decks_value = new int[6][52];
        for (int i = 0; i < 6; i++)
            for (int j = 0; j < 52; j++)
                decks_value[i][j] = 1;
        begin = false;
        player_soft = 0;
        computer_soft = 0;

        new_turn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = betField.getText();
                try {
                    bet_amount = Integer.parseInt(str);
                } catch (NumberFormatException ee) {
                    notice_label.setText("Please input an integer!");
                    System.out.println("Your input is wrong, please input an integer!");
                    bet_amount = 0;
                }
                if (!begin && bet_amount > player_money && player_money != 0){
                    notice_label.setText("Don't have so much money!");
                    return;
                }
                if (!begin && player_money == 0){
                    notice_label.setText("No money, please restart!");
                    return;
                }
                if (!begin && bet_amount != 0) {
                    notice_label.setText("Notice");
                    bet_amount_label.setText("Your bet amount is: " + bet_amount);
                    player_money -= bet_amount;
                    moneyLabel.setText("Your have $" + player_money);
                    computerLabel.setText("Computer Point: 0");
                    panel_n.removeAll();
                    panel_n.add(computerLabel);
                    panel_s.removeAll();
                    panel_s.add(playerLabel);
                    giveCard("n", true);
                    giveCard("n", false);
                    giveCard("s", true);
                    giveCard("s", true);
                    begin = true;
                } else if (begin){
                    System.out.println("You must finish this turn to start a new turn!");
                    notice_label.setText("You must finish this turn!");
                } else {
                    System.out.println("Your bet amount is 0, please input bet amount!");
                    notice_label.setText("Please input bet amount!");
                }
            }
        });
        hit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (begin) {
                    if (player_point > 21 && player_soft != 0){
                        player_point -= 10;
                        player_soft--;
                    }
                    if (player_point <= 21)
                        giveCard("s", true);
                    if (player_point > 21) {
                        if (player_soft != 0) {
                            player_point -= 10;
                            player_soft--;
                        } else {
                            panel_n.removeAll();
                            panel_n.add(computerLabel);
                            addPicture(1, computer_n2_1 + 1);
                            addPicture(1, computer_n2_2 + 1);
                            resultLabel.setText("You bust!");
                            computerLabel.setText("Computer Point: " + computer_point);
                            result_area.append("You get " + player_point + " points, " +
                                    "computer get " + computer_point + " points, " +
                                    "you lose $" + bet_amount + " !\n");
                            begin = false;
                            computer_point = 0;
                            player_point = 0;
                            computer_soft = 0;
                            player_soft = 0;
                            return;
                        }
                    }
                } else {
                    notice_label.setText("You haven't start a new turn!");
                }
            }
        });
        stand.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (begin) {
                    panel_n.removeAll();
                    panel_n.add(computerLabel);
                    addPicture(1, computer_n2_1 + 1);
                    addPicture(1, computer_n2_2 + 1);
                    //if ()
                    if (computer_point > 21 && computer_soft != 0){
                        computer_point -= 10;
                        computer_soft--;
                    }
                    while (computer_point < 17) {
                        giveCard("n", true);
                        if (computer_point > 21) {
                            if (computer_soft != 0) {
                                computer_point -= 10;
                                computer_soft--;
                            } else
                                break;
                        }
                    }
                    computerLabel.setText("Computer Point: " + computer_point);
                    if (computer_point > 21){
                        resultLabel.setText("Computer bust!");
                        player_money += 2 * bet_amount;
                        moneyLabel.setText("Your have $" + player_money);
                        result_area.append("You get " + player_point + " points, " +
                                "computer get " + computer_point + " points, " +
                                "you win $" + bet_amount + " !\n");
                        begin = false;
                        computer_point = 0;
                        player_point = 0;
                        computer_soft = 0;
                        player_soft = 0;
                        return;
                    }
                    if (computer_point > player_point){
                        resultLabel.setText("Computer win!");
                        result_area.append("You get " + player_point + " points, " +
                                "computer get " + computer_point + " points, " +
                                "you lose $" + bet_amount + " !\n");
                    } else if (computer_point == player_point){
                        resultLabel.setText("Tie!");
                        player_money += bet_amount;
                        moneyLabel.setText("Your have $" + player_money);
                        result_area.append("You get " + player_point + " points, " +
                                "computer get " + computer_point + " points, " +
                                "tie !\n");
                    } else {
                        resultLabel.setText("You win!");
                        player_money += 2 * bet_amount;
                        moneyLabel.setText("Your have $" + player_money);
                        result_area.append("You get " + player_point + " points, " +
                                "computer get " + computer_point + " points, " +
                                "you win $" + bet_amount + " !\n");
                    }
                    begin = false;
                    computer_point = 0;
                    player_point = 0;
                    computer_soft = 0;
                    player_soft = 0;
                } else {
                    notice_label.setText("You haven't start a new turn!");
                }

            }
        });
        reload.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < 6; i++) {
                    decks_amount[i] = 52;
                    for (int j = 0; j < 52; j++)
                        decks_value[i][j] = 1;
                }
                for (int i = 0; i < 6; i++) {
                    decks_label[i].setText("Deck " + (i + 1) + ": " +
                            decks_amount[i] + " cards");
                }
            }
        });
        add(panel_w, BorderLayout.WEST);
    }

    public void createPanel_e(){
        panel_e = new JPanel();
        restart = new JButton("Restart");
        panel_e.setLayout(new GridLayout(3, 1));
        //panel_e.setLayout(new Verr);
        result_area = new JTextArea(AREA_ROWS, AREA_COLUMNS);
        result_area.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(result_area);
        panel_e.add(scrollPane);
        panel_e.add(restart);
        restart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                begin = false;
                computer_point = 0;
                player_point = 0;
                playerLabel.setText("Player Point: " + player_point);
                computerLabel.setText("Computer Point: " + computer_point);
                resultLabel.setText("Result: no result");
                computer_soft = 0;
                player_soft = 0;
                computer_n1_1 = 0;
                computer_n1_2 = 0;
                computer_n2_1 = 0;
                computer_n2_2 = 0;
                player_money = 1000;
                moneyLabel.setText("Your have $" + player_money);
                result_area.setText("");
                panel_n.removeAll();
                panel_n.add(computerLabel);
                panel_s.removeAll();
                panel_s.add(playerLabel);
                bet_amount = 0;
                bet_amount_label.setText("Your bet amount is: $" + bet_amount);
                betField.setText("");
                notice_label.setText("Notice");
                for (int i = 0; i < 6; i++) {
                    decks_amount[i] = 52;
                    for (int j = 0; j < 52; j++)
                        decks_value[i][j] = 1;
                }
                for (int i = 0; i < 6; i++) {
                    decks_label[i].setText("Deck " + (i + 1) + ": " +
                            decks_amount[i] + " cards");
                }
            }
        });
        //panel_e.setPreferredSize(new Dimension(200, 800));
        add(panel_e, BorderLayout.EAST);
    }

    public void giveCard(String str, boolean up){
        int location;
        if (str.equals("n"))
            location = 1;
        else
            location = 5;
        if (!up)
            addPicture(location, 53);
        int n1;
        int n2;
        if (decks_amount[0] + decks_amount[1] + decks_amount[2] + decks_amount[3] + decks_amount[4] +
                decks_amount[5] != 0) {
            n1 = random.nextInt(6);
            n2 = random.nextInt(52);
            while (decks_amount[n1] == 0) {
                n1 = random.nextInt(6);
            }
            while (decks_value[n1][n2] == 0) {
                n2 = random.nextInt(52);
            }
            decks_amount[n1]--;
            decks_value[n1][n2] = 0;
            decks_label[n1].setText("Deck " + (n1 + 1) + ": " + decks_amount[n1] + " cards");
            if (str.equals("n")){
                if (up) {
                    computer_n1_1 = n1;
                    computer_n2_1 = n2;
                } else {
                    computer_n1_2 = n1;
                    computer_n2_2 = n2;
                }
            }
            if (up)
                addPicture(location, n2 + 1);
            if (n2 % 13 == 0){
                if (str.equals("n")) {
                    computer_point += 11;
                    computer_soft++;
                }
                else {
                    player_point += 11;
                    player_soft++;
                }
            } else if (n2 % 13 >= 10 && n2 % 13 <= 12){
                if (str.equals("n"))
                    computer_point += 10;
                else
                    player_point += 10;
            } else {
                if (str.equals("n"))
                    computer_point += n2 % 13 + 1;
                else
                    player_point += n2 % 13 + 1;
            }

            playerLabel.setText("Player Point: " + player_point);
        }

        if (decks_amount[0] + decks_amount[1] + decks_amount[2] + decks_amount[3] + decks_amount[4] +
                decks_amount[5] == 0) {
            reload.setVisible(true);
            notice_label.setText("Cards run out, please reload!");
            begin = false;
            computer_point = 0;
            player_point = 0;
            computer_soft = 0;
            player_soft = 0;
            playerLabel.setText("Player Point: " + player_point);
            computerLabel.setText("Computer Point: " + computer_point);
            return;
        }

    }


    public void createPanel_c(){
        panel_c = new JPanel();
        panel_c.setLayout(new GridLayout(2, 6));
        decks_amount = new int[6];
        decks_label = new JLabel[6];
        int i = 0;
//        for (int j = 0; j < 6; j++) {
//            decks_amount[j] = 52;
//            decks_common[j] = new JLabel("Deck " + (i + 1) + " remains:");
//            panel_c.add(decks_common[j]);
//        }
        for (i = 0; i < 6; i++) {
            decks_amount[i] = 52;
            decks_label[i] = new JLabel("Deck " + (i + 1) + ": " + decks_amount[i] + " cards");
            panel_c.add(decks_label[i]);
        }

        for (i = 0; i < 6; i++)
            addPicture(3, 53);


        add(panel_c, BorderLayout.CENTER);
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
                //repaint();
            }
        };
        component.setPreferredSize(new Dimension(COMPONENT_WIDTH, COMPONENT_HEIGHT));
        if (i == 1) {
            panel_n.add(component);
            panel_n.revalidate();
        }
        else if (i == 2){
            panel_w.add(component);
            panel_w.revalidate();
        }
        else if (i == 3){
            panel_c.add(component);
            panel_c.revalidate();
        }
        else if (i == 4){
            panel_e.add(component);
            panel_e.revalidate();
        }
        else if (i == 5){
            panel_s.add(component);
            panel_s.revalidate();
        }

    }
}
