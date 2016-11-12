package _07blackjack.YodaApps;

import java.util.Scanner;

/**
 * Created by yangmei555 on 2016/11/11.
 */
public class YodaSpeak {
    public static void main(String[] args) {
        String str;
        Scanner in = new Scanner(System.in);
        System.out.println("Please input a sentence: ");
        str = in.nextLine();
        String[] strings = str.split(" ");
        System.out.println("\nThe reverse order of the words is: ");
        String reverse = reverseYoda(strings);
        System.out.println(reverse);
    }

    public static String reverseYoda(String[] strings){
        int length = strings.length;
        String newString = new String();
        for (int i = 0; i < length; i++){
            newString += strings[length - 1 - i] + ' ';
        }
        return newString;
    }
}
