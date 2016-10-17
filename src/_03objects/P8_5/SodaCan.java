package _03objects.P8_5;

import com.sun.corba.se.impl.interceptors.PICurrent;

import static java.lang.Math.PI;

/**
 * Created by yangmei555 on 2016/10/16.
 */
public class SodaCan {
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
}
