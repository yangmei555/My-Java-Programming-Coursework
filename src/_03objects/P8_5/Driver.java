package _03objects.P8_5;

/**
 * Created by yangmei555 on 2016/10/16.
 */
public class Driver {
    public static void main(String[] args){
        SodaCan can1 = new SodaCan(2.2, 3.3);
        SodaCan can2 = new SodaCan(4.4, 5.5);
        System.out.println("The surface area of can1 is " + can1.getSurfaceArea());
        System.out.println("The volume of can1 is " + can1.getVolume());
        System.out.println();
        System.out.println("The surface area of can2 is " + can2.getSurfaceArea());
        System.out.println("The volume of can2 is " + can2.getVolume());
        System.out.println();
    }
}
