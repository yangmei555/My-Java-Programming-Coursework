package _04interfaces.P9_10;

/**
 * Created by yangmei555 on 2016/10/23.
 */
public class Driver {
    public static void main(String[] args) {
        BetterRectangle rec1 = new BetterRectangle(1,2,3,4);
        System.out.println("For rec1");
        System.out.println("The perimeter is: ");
        System.out.println(rec1.getPerimeter());
        System.out.println("The area is: ");
        System.out.println(rec1.getArea());
        System.out.println();

        BetterRectangle rec2 = new BetterRectangle(4,5,6,9);
        System.out.println("For rec2");
        System.out.println("The perimeter is: ");
        System.out.println(rec2.getPerimeter());
        System.out.println("The area is: ");
        System.out.println(rec2.getArea());
    }
}
