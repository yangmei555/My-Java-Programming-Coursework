package _04interfaces.P9_14;

import _04interfaces.P9_8.Person;
import _04interfaces.P9_8.Student;

import java.awt.*;

/**
 * Created by yangmei555 on 2016/10/23.
 */
public class Driver {
    public static void main(String[] args) {
        Measurable[] soda = new Measurable[5];
        soda[0] = new SodaCan(1.1, 2.2);
        soda[1] = new SodaCan(3.3, 4.4);
        soda[2] = new SodaCan(5.5, 6.6);
        soda[3] = new SodaCan(7.7, 8.8);
        soda[4] = new SodaCan(9.9, 10.1);
        System.out.println("Average surface area: " + average(soda));

    }

    public static double average(Measurable[] mea){
        if (mea.length == 0)
            return 0;
        double sum = 0;
        for (Measurable measurable : mea) {
            sum += measurable.getMeasure();
        }
        return sum / mea.length;
    }
}
