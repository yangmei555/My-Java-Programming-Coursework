package _02arrays;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by yangmei555 on 2016/10/7.
 */
public class P6_12 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] a = new int[20];
        Random rd = new Random();
        int i;
        for (i = 0; i < 20; i++)
            a[i] = 1 + rd.nextInt(6);
        boolean inRun = false;
        for (i = 0; i < 20; i++){
            if (inRun == true){
                if (a[i] != a[i-1]) {
                    System.out.print(") ");
                    inRun = false;
                }
            }
            if (i != 19 && inRun == false){
                if (a[i] == a[i+1]) {
                    System.out.print("( ");
                    inRun = true;
                }
            }
            System.out.print(a[i] + " ");
        }
        if (inRun == true)
            System.out.println(")");
    }
}
