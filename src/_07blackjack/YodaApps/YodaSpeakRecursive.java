package _07blackjack.YodaApps;

import java.util.Scanner;

/**
 * Created by yangmei555 on 2016/11/11.
 */
public class YodaSpeakRecursive {
    public static void main(String[] args) {
        String str;
        Scanner in = new Scanner(System.in);
        System.out.println("Please input a sentence: ");
        str = in.nextLine();
        System.out.println("\nThe reverse order of the words is: ");
        String[] strings = str.split(" ");
        int length = strings.length;
        String reverse = reverseYoda(strings, length);
        System.out.println(reverse);
    }

    public static String reverseYoda(String[] strings, int length){
        if (length == 1)
            return strings[0] + " ";
        else
            return strings[length - 1] + " " + reverseYoda(strings, length - 1);
    }
}
