package _04interfaces.P9_10;

import java.awt.*;

/**
 * Created by yangmei555 on 2016/10/23.
 */
public class BetterRectangle extends Rectangle {
    public BetterRectangle(int x, int y, int width, int height){
        setLocation(x, y);
        setSize(width, height);
    }
    public int getPerimeter(){
        return 2 * (width + height);
    }
    public int getArea(){
        return width * height;
    }
}
