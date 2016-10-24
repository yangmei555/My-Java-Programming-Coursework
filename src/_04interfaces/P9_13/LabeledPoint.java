package _04interfaces.P9_13;

import java.awt.*;

/**
 * Created by yangmei555 on 2016/10/23.
 */
public class LabeledPoint {
    Point p;
    String label;
    public LabeledPoint(int x, int y, String label){
        p = new Point(x, y);
        this.label = label;
    }
    public String toString(){
        return p.toString() + "[label=" + label + "]";
    }
}
