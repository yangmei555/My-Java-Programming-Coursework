package _03objects.P8_15;

import _03objects.P8_14.Geometry;

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
        System.out.printf("%.2f", Sphere.sphereVolume(r));
        System.out.println();
        System.out.printf("%.2f",Sphere.sphereSurface(r));
        System.out.println();
        System.out.printf("%.2f",Cylinder.cylinderVolume(r, h));
        System.out.println();
        System.out.printf("%.2f",Cylinder.cylinderSurface(r, h));
        System.out.println();
        System.out.printf("%.2f",Cone.coneVolume(r, h));
        System.out.println();
        System.out.printf("%.2f",Cone.coneSurface(r, h));
        System.out.println();
    }
}
