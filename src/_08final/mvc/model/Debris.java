package _08final.mvc.model;

import _08final.mvc.controller.Game;

import java.awt.*;
import java.util.*;

/**
 * Created by 0 on 2016/11/30.
 */
public class Debris extends Sprite {

    private Sprite sprite;
    private final int POSITION = 35;

    public Debris(Sprite sprite) {

        super();
        setTeam(Team.DEBRIS);

        //defined the points on a cartesean grid
        ArrayList<Point> pntCs = new ArrayList<Point>();

        pntCs.add(new Point(0, 0)); //top point

        pntCs.add(new Point(6, 0));
        pntCs.add(new Point(6, 6));
        pntCs.add(new Point(0, 6));

        assignPolarPoints(pntCs);

        //a bullet expires after 20 frames
        setExpire(20);
        setRadius(10);


        setDeltaX(sprite.getDeltaX() + POSITION - Game.R.nextInt(2 * POSITION));
        setDeltaY(sprite.getDeltaY() + POSITION -
                Game.R.nextInt(2 * POSITION));
        setCenter(sprite.getCenter());
        setOrientation(sprite.getOrientation());
    }

    @Override
    public void move() {

        super.move();

        if (getExpire() == 0)
            CommandCenter.getInstance().getOpsList().enqueue(this, CollisionOp.Operation.REMOVE);
        else
            setExpire(getExpire() - 1);

    }
}
