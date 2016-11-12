package _07blackjack.blackjack;

import javax.swing.*;

/**
 * Created with IntelliJ IDEA.
 * User: ag
 * Date: 10/28/13
 * Time: 4:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class Driver {
    //nothing implemented here
    public static void main(String[] args) {
        JFrame frame = new BlackJackFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("BlackJack");
        frame.setVisible(true);
    }
}
