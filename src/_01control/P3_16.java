package _01control;

import java.util.Scanner;

/**
 * Created by Adam on 9/28/2015.
 */
public class P3_16 {

    public static void main(String[] args) {
        //stub
        System.out.print("Enter three strings: ");
        Scanner in  = new Scanner(System.in);
        String a, b, c, d;
        a = in.next();
        b = in.next();
        c = in.next();
        if (a.compareTo(b) > 0){
            d = a;
            a = b;
            b = d;
        }
        if (a.compareTo(c) > 0){
            d = a;
            a = c;
            c = d;
        }
        if (b.compareTo(c) > 0){
            d = c;
            c = b;
            b = d;
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
