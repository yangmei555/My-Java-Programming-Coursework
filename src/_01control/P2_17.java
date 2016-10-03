package _01control;

/**
 * Created by admin on 2016/10/2.
 */
import java.util.Scanner;

public class P2_17 {
    public static void main(String[] args) {
        //stub
        String a, d;
        int b, c, e, f;
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the first time: ");
        a = in.next();
        b = Integer.valueOf(a.substring(0, 2)).intValue();
        c = Integer.valueOf(a.substring(2, 4)).intValue();
        System.out.print("Please enter the second time: ");
        d = in.next();
        e = Integer.valueOf(d.substring(0, 2)).intValue();
        f = Integer.valueOf(d.substring(2, 4)).intValue();

        if (c <= f){
            if (b <= e)
                System.out.println(e - b + " hour(s) " + (f - c) + " minute(s)");
            else
                System.out.println(24 + e - b + " hour(s) " + (f - c) + " minute(s)");
        }
        else{
            if (e - b >= 1)
                System.out.println(e - 1 - b + " hour(s) " + (60 + f - c) + " minute(s)");
            else
                System.out.println(23 + e - b + " hour(s) " + (60 + f - c) + " minute(s)");
        }
    }
}
