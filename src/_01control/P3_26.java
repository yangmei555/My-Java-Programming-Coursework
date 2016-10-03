package _01control;

/**
 * Created by admin on 2016/10/2.
 */

import java.util.Scanner;

public class P3_26 {
    public static void main(String args[]){
        System.out.print("Please enter a positive integer: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.print("The Roman number is: ");
        switch (number / 1000){
            case 3:
                System.out.print("MMM");
                number -= 3000;
                break;
            case 2:
                System.out.print("MM");
                number -= 2000;
                break;
            case 1:
                System.out.print("M");
                number -= 1000;
                break;
        }
        switch (number / 100) {
            case 9:
                System.out.print("CM");
                number -= 900;
                break;
            case 8:
                System.out.print("DCCC");
                number -= 800;
                break;
            case 7:
                System.out.print("DCC");
                number -= 700;
                break;
            case 6:
                System.out.print("DC");
                number -= 600;
                break;
            case 5:
                System.out.print("D");
                number -= 500;
                break;
            case 4:
                System.out.print("CD");
                number -= 400;
                break;
            case 3:
                System.out.print("CCC");
                number -= 300;
                break;
            case 2:
                System.out.print("CC");
                number -= 200;
                break;
            case 1:
                System.out.print("C");
                number -= 100;
                break;
        }
        switch (number / 10){
            case 9:
                System.out.print("XC");
                number -= 90;
                break;
            case 8:
                System.out.print("LXXX");
                number -= 80;
                break;
            case 7:
                System.out.print("LXX");
                number -= 70;
                break;
            case 6:
                System.out.print("LX");
                number -= 60;
                break;
            case 5:
                System.out.print("L");
                number -= 50;
                break;
            case 4:
                System.out.print("XL");
                number -= 40;
                break;
            case 3:
                System.out.print("XXX");
                number -= 30;
                break;
            case 2:
                System.out.print("XX");
                number -= 20;
                break;
            case 1:
                System.out.print("X");
                number -= 10;
                break;
        }
        switch (number){
            case 9:
                System.out.print("IX");
                break;
            case 8:
                System.out.print("VIII");
                break;
            case 7:
                System.out.print("VII");
                break;
            case 6:
                System.out.print("VI");
                break;
            case 5:
                System.out.print("V");
                break;
            case 4:
                System.out.print("IV");
                break;
            case 3:
                System.out.print("III");
                break;
            case 2:
                System.out.print("II");
                break;
            case 1:
                System.out.print("I");
                break;
        }
        System.out.println();
    }
}
