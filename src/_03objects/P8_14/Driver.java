package _03objects.P8_14;

import java.util.Scanner;

/**
 * Created by yangmei555 on 2016/10/16.
 */
public class Driver {
    public static void main(String[] args){
        double r, h;
        System.out.println("Please enter the value of r and h: ");
        Scanner in = new Scanner(System.in);
        r = in.nextDouble();
        h = in.nextDouble();
        System.out.printf("%.2f",Geometry.sphereVolume(r));
        System.out.println();
        System.out.printf("%.2f",Geometry.sphereSurface(r));
        System.out.println();
        System.out.printf("%.2f",Geometry.cylinderVolume(r, h));
        System.out.println();
        System.out.printf("%.2f",Geometry.cylinderSurface(r, h));
        System.out.println();
        System.out.printf("%.2f",Geometry.coneVolume(r, h));
        System.out.println();
        System.out.printf("%.2f",Geometry.coneSurface(r, h));
        System.out.println();
    }
}
