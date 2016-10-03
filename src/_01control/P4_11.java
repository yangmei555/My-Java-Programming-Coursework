package _01control;

/**
 * Created by admin on 2016/10/2.
 */
import java.util.Scanner;

public class P4_11 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a word: ");
        String str = in.next();
        int i = 0, count = 0;
        boolean flag = true;
        while (i < str.length()){
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'y' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U' || str.charAt(i) == 'Y') {
                if (flag == true) {
                    count++;
                    flag = false;
                }
            }
            else
                flag = true;
            i++;
        }
        if (str.charAt(str.length() - 1) == 'e')
            count--;
        if (count == 0)
            count++;
        System.out.println("The number of syllables is " + count);
    }
}
