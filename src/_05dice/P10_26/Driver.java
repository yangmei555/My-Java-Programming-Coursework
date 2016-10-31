package _05dice.P10_26;

import javax.swing.*;
import java.awt.*;

/**
 * Created by yangmei555 on 2016/10/30.
 */
public class Driver {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setTitle("Five Rings");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Component component = new RingComponent();

        frame.add(component);
        frame.setVisible(true);
    }
}
