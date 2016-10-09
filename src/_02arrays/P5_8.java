package _02arrays;

/**
 * Created by yangmei555 on 2016/10/7.
 */
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class P5_8 {
    public static void main(String[] args){
        String str;
        Scanner in = new Scanner(System.in);
        str = in.next();
        str = scramble(str);

        System.out.println(str);
    }
    public static String scramble(String word){
        int n = word.length(), i, j;
        if (n <= 3)
            return word;
        else {
            Random rd = new Random();
            i = 1 + rd.nextInt(n - 2);
            j = 1 + rd.nextInt(n - 2);
            while (i == j)
                j = 1 + rd.nextInt(n - 2);
            StringBuilder strb = new StringBuilder(word);
            strb.setCharAt(i, word.charAt(j));
            strb.setCharAt(j, word.charAt(i));
            word = strb.toString();
            return word;
        }
    }
}
