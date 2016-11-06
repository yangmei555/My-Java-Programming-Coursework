package _06design.P12_6;



import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;
import com.sun.org.apache.xml.internal.dtm.ref.DTMDefaultBaseIterators;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by yangmei555 on 2016/11/5.
 */
public class LevelOne {
    private int a, b, c, n = 2;
    private static final int LEVEL = 1;
    public LevelOne(){
        Random random = new Random();
        a = random.nextInt(10);
        b = random.nextInt(10);
        while (a + b >= 10){
            b = random.nextInt(10);
        }
    }
    public void show(){
        System.out.println("This is a level " + LEVEL + " problem");
        System.out.print("You have " + n + " chance");
        if (n == 2)
            System.out.println("s");
        else
            System.out.println();
        System.out.println(a + " + " + b + " = ?" + "\nPlease input your answer: ");
    }
    public boolean test(){
        Scanner in = new Scanner(System.in);
        String str = in.next();
        while (true){
            try {
                Integer.parseInt(str);
                break;
            } catch (Exception e){
                System.out.println("Please input a number less than 10: ");
                str = in.next();
            }
        }
        c = Integer.parseInt(str);
        if (c == a + b)
            return true;
        else {
            n--;
            return false;
        }
    }
}
