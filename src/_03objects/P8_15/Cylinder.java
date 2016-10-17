package _03objects.P8_15;

/**
 * Created by yangmei555 on 2016/10/16.
 */
public class Cylinder {
    public static double cylinderVolume(double r, double h){
        return Math.PI*r*r*h;
    }
    public static double cylinderSurface(double r, double h){
        return 2*Math.PI*r*h + 2*Math.PI*r*r;
    }
}
