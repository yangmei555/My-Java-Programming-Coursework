package _03objects.P8_15;

/**
 * Created by yangmei555 on 2016/10/16.
 */
public class Cone {
    public static double coneVolume(double r, double h){
        return Math.PI*r*r*h/3;
    }
    public static double coneSurface(double r, double h){
        return Math.PI*r* Math.sqrt(r*r+h*h) + Math.PI*r*r;
    }
}
