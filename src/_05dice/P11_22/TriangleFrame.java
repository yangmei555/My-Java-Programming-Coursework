package _05dice.P11_22;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by yangmei555 on 2016/10/30.
 */
public class TriangleFrame extends JFrame {
    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 500;
    private int n = 1;
    private int x1, y1, x2, y2, x3, y3;
    private TriangleComponent triangle;

    class MousePressListener implements MouseListener {
        public void mousePressed(MouseEvent event){
            if (n % 3 == 1) {
                x1 = event.getX();
                y1 = event.getY();
                triangle.pass(x1, y1, x1, y1, 0, 0, n);
                n++;
            } else if (n % 3 == 2){
                x2 = event.getX();
                y2 = event.getY();
                triangle.pass(x1, y1, x2, y2, 0, 0, n);
                n++;
            } else {
                x3 = event.getX();
                y3 = event.getY();
                triangle.pass(x1, y1, x2, y2, x3, y3, n);
                n++;
            }


        }
        public void mouseReleased(MouseEvent event) {}
        public void mouseClicked(MouseEvent event) {}
        public void mouseEntered(MouseEvent event) {}
        public void mouseExited(MouseEvent event) {}
    }
    public TriangleFrame(){
        triangle = new TriangleComponent();
        add(triangle);
        MouseListener listener = new MousePressListener();
        triangle.addMouseListener(listener);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }
}
