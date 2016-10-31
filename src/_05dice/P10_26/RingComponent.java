package _05dice.P10_26;

import sun.management.snmp.jvmmib.JvmRTClassPathEntryMeta;

import javax.swing.*;
import java.awt.*;

/**
 * Created by yangmei555 on 2016/10/30.
 */
public class RingComponent extends JComponent {

    public void paintComponent(Graphics g){
        drawRing(g, 100, 100, 100, 100, 0, 0, 255);
        drawRing(g, 210, 100, 100, 100, 0, 0, 0);
        drawRing(g, 320, 100, 100, 100, 255, 0, 0);
        drawRing(g, 155, 150, 100, 100, 255, 255, 0);
        drawRing(g, 265, 150, 100, 100, 0, 255, 0);
    }
    public void drawRing(Graphics g, int x, int y, int width, int height, int R, int B, int G){
        System.out.println(g instanceof Graphics2D);
        Graphics2D gg = (Graphics2D) g;
        gg.setStroke(new BasicStroke(10.0f));
        g.setColor(new Color(R, B, G));
        g.drawOval(x, y, width, height);
    }
}
