package _03objects.P8_14;

import java.util.Map;
import java.util.regex.Matcher;

/**
 * Created by yangmei555 on 2016/10/16.
 */
public class Geometry {
    public static double sphereVolume(double r){
        return 4*Math.PI*r*r*r/3;
    }
    public static double sphereSurface(double r){
        return 4*Math.PI*r*r;
    }
    public static double cylinderVolume(double r, double h){
        return Math.PI*r*r*h;
    }
    public static double cylinderSurface(double r, double h){
        return 2*Math.PI*r*h + 2*Math.PI*r*r;
    }
    public static double coneVolume(double r, double h){
        return Math.PI*r*r*h/3;
    }
    public static double coneSurface(double r, double h){
        return Math.PI*r* Math.sqrt(r*r+h*h) + Math.PI*r*r;
    }
}
