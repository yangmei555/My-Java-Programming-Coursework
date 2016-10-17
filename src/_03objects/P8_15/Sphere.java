package _03objects.P8_15;

/**
 * Created by yangmei555 on 2016/10/16.
 */
public class Sphere {
    public static double sphereVolume(double r){
        return 4*Math.PI*r*r*r/3;
    }
    public static double sphereSurface(double r){
        return 4*Math.PI*r*r;
    }
}
