package _08final.mvc.model;

import _08final.mvc.controller.Game;

import java.awt.*;
import java.util.ArrayList;


public class UFOBullet extends Sprite {

	  private final double FIRE_POWER = 35.0;



public UFOBullet(UFO ufo){
		
		super();
	    setTeam(Team.FOE);
		
		//defined the points on a cartesean grid
		ArrayList<Point> pntCs = new ArrayList<Point>();
		
		pntCs.add(new Point(0,3)); //top point
		
		pntCs.add(new Point(1,-1));
		pntCs.add(new Point(0,-2));
		pntCs.add(new Point(-1,-1));

		assignPolarPoints(pntCs);

		//a bullet expires after 20 frames
	    setExpire( 20 );
	    setRadius(6);
	    setColor(ufo.getColor());

	    //everything is relative to the falcon ship that fired the bullet
	    setDeltaX( ufo.getDeltaX() +
	               Math.cos( Math.toRadians( ufo.getOrientation() ) ) * FIRE_POWER );
	    setDeltaY( ufo.getDeltaY() +
	               Math.sin( Math.toRadians( ufo.getOrientation() ) ) * FIRE_POWER );
	    setCenter( ufo.getCenter() );

	    //set the bullet orientation to the falcon (ship) orientation
	    //setOrientation(ufo.getOrientation());
		setOrientation(Game.R.nextInt(360));

	}

	@Override
	public void move(){

		super.move();

		if (getExpire() == 0)
			CommandCenter.getInstance().getOpsList().enqueue(this, CollisionOp.Operation.REMOVE);
		else
			setExpire(getExpire() - 1);

	}

}
