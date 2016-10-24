package _04interfaces.P9_13;

/**
 * Created by yangmei555 on 2016/10/23.
 */
public class Driver {
    public static void main(String[] args) {
        LabeledPoint lp = new LabeledPoint(3, 5, "Chicago");
        String str = lp.toString();
        System.out.println("For point1");
        System.out.println(str);
        System.out.println();

        LabeledPoint lp2 = new LabeledPoint(2, 9, "New York");
        String str2 = lp2.toString();
        System.out.println("For point2");
        System.out.println(str2);
    }
}
