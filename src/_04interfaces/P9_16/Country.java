package _04interfaces.P9_16;

import _03objects.P8_9.ComboLock;
import _04interfaces.P9_14.*;

/**
 * Created by yangmei555 on 2016/10/23.
 */
public class Country implements Measurable{
    private String name;
    private double area;
    public Country(String n, double a){
        name = n;
        area = a;
    }
    public String getName(){
        return name;
    }
    public double getMeasure(){
        return area;
    }
}
