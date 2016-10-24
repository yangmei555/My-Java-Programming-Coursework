package _04interfaces.P9_8;

import java.time.chrono.IsoChronology;

/**
 * Created by yangmei555 on 2016/10/23.
 */
public class Instructor extends Person{
    private double salary;
    public Instructor(String n, int b, double s){
        super(n, b);
        salary = s;
    }
    public String toString(){
        return "Instructor" + "[name=" + getname() + ", birthyear=" + getbirthyear() + ", salary=" + salary + "]";
    }
}
