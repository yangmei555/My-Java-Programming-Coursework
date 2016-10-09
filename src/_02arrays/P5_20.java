package _02arrays;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by yangmei555 on 2016/10/7.
 */
public class P5_20 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        if (isLeapYear(year) == true)
            System.out.println("This is a leap year.");
        else
            System.out.println("This is not a leap year.");
    }
    public static boolean isLeapYear(int year){
        if (year % 100 == 0){
            if (year % 400 == 0)
                return true;
            else
                return false;
        }
        else if (year % 4 == 0)
            return true;
        else
            return false;
    }
}
