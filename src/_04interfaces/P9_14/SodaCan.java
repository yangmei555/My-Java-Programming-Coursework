package _04interfaces.P9_14;

/**
 * Created by yangmei555 on 2016/10/23.
 */
public class SodaCan implements Measurable{
    private double height;
    private double radius;
    public SodaCan(double height, double radius){
        this.height = height;
        this.radius = radius;
    }
    public double getSurfaceArea(){
        return 2*Math.PI*radius*height + 2*Math.PI*radius*radius;
    }
    public double getVolume(){
        return Math.PI*radius*radius*height;
    }
    public double getMeasure(){
        return getSurfaceArea();
    }
}
