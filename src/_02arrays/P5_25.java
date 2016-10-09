package _02arrays;

import java.util.Scanner;

/**
 * Created by yangmei555 on 2016/10/7.
 */
public class P5_25 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int d = in.nextInt();
        printDigit(d);
        printBarCode(d);
    }
    public static void printDigit(int d){
        System.out.println(d);
    }
    public static void printBarCode(int zipCode){
        int sum = 0;
        System.out.print('|');
        int d, i;
        for (i = 0; i < 6; i++){
            if (i <5) {
                d = zipCode / (int) Math.pow(10, 4 - i);
                zipCode -= d * (int) Math.pow(10, 4 - i);
                sum += d;
            }
            else {
                if (sum % 10 == 0)
                    d = 0;
                else
                    d = (sum / 10 + 1) * 10 - sum;
            }
            if (d == 0)
                System.out.print("||:::");
            else {
                int ones = 0;
                if (d >= 7){
                    System.out.print("|");
                    d -= 7;
                    ones++;
                }
                else
                    System.out.print(":");
                if (d >= 4){
                    System.out.print("|");
                    d -= 4;
                    ones++;
                }
                else
                    System.out.print(":");
                if (d >= 2){
                    System.out.print("|");
                    d -= 2;
                    ones++;
                }
                else
                    System.out.print(":");
                if (d >= 1){
                    System.out.print("|");
                    d -= 1;
                    ones++;
                }
                else
                    System.out.print(":");
                if (ones % 2 == 1)
                    System.out.print("|");
                else
                    System.out.print(":");
            }
        }
        System.out.println("|");
    }
}
