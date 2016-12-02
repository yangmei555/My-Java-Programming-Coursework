package _08final.mvc.model;

import java.awt.*;
import java.util.ArrayList;


public class Bullet_New extends Sprite {

	  private final double FIRE_POWER = 35.0;



public Bullet_New(Falcon fal){
		
		super();
	    setTeam(Team.FRIEND);
		
		//defined the points on a cartesean grid
		ArrayList<Point> pntCs = new ArrayList<Point>();
		
		pntCs.add(new Point(0,20)); //top point
		
		pntCs.add(new Point(20,0));
		pntCs.add(new Point(0,-20));
		pntCs.add(new Point(-20,0));

		assignPolarPoints(pntCs);

		//a bullet expires after 20 frames
	    setExpire( 20 );
	    setRadius(50);
	    

	    //everything is relative to the falcon ship that fired the bullet
	    setDeltaX( fal.getDeltaX() +
	               Math.cos( Math.toRadians( fal.getOrientation() ) ) * FIRE_POWER );
	    setDeltaY( fal.getDeltaY() +
	               Math.sin( Math.toRadians( fal.getOrientation() ) ) * FIRE_POWER );
	    setCenter( fal.getCenter() );

	    //set the bullet orientation to the falcon (ship) orientation
	    setOrientation(fal.getOrientation());


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
