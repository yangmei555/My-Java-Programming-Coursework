package _05dice.P11_22;

import javax.swing.*;
import java.awt.*;

/**
 * Created by yangmei555 on 2016/10/30.
 */
public class TriangleComponent extends JComponent {
    private int x1;
    private int x2;
    private int x3;
    private int y1;
    private int y2;
    private int y3;
    private int n;
    public void paintComponent(Graphics g){
        if (n % 3 == 1)
            g.drawLine(x1, y1, x1, y1);
        else if (n %3 == 2)
            g.drawLine(x1, y1, x2, y2);
        else{
            g.drawLine(x1, y1, x2, y2);
            g.drawLine(x1, y1, x3, y3);
            g.drawLine(x2, y2, x3, y3);
        }
    }
    public void pass(int a, int b, int c, int d, int e, int f, int N){
        n = N;
        x1 = a;
        y1 = b;
        x2 = c;
        y2 = d;
        x3 = e;
        y3 = f;
        repaint();
    }
}
