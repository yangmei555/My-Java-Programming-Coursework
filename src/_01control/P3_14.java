package _01control;

/**
 * Created by admin on 2016/10/2.
 */

import java.util.Scanner;

public class P3_14 {
    public static void main(String[] args) {
        //stub
        System.out.print("Enter the card notation: ");
        String str;
        Scanner in = new Scanner(System.in);
        str = in.next();
        switch (str.charAt(0)){
            case 'A':
                System.out.print("Ace");
                break;
            case '2':
                System.out.print("2");
                break;
            case '3':
                System.out.print("3");
                break;
            case '4':
                System.out.print("4");
                break;
            case '5':
                System.out.print("5");
                break;
            case '6':
                System.out.print("6");
                break;
            case '7':
                System.out.print("7");
                break;
            case '8':
                System.out.print("8");
                break;
            case '9':
                System.out.print("9");
                break;
            case '1':
                System.out.print("10");
                break;
            case 'J':
                System.out.print("Jack");
                break;
            case 'Q':
                System.out.print("Queen");
                break;
            case 'K':
                System.out.print("King");
                break;
        }
        System.out.print(" of ");
        switch (str.charAt(0) == '1' ? str.charAt(2) : str.charAt(1)){
            case 'D':
                System.out.println("Diamonds");
                break;
            case 'H':
                System.out.println("Hearts");
                break;
            case 'S':
                System.out.println("Spades");
                break;
            case 'C':
                System.out.println("Clubs");
                break;
        }
    }

}
