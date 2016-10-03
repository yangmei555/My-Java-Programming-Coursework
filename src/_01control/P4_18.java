package _01control;

/**
 * Created by admin on 2016/10/2.
 */
import java.util.Scanner;

public class P4_18 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a integer: ");
        int num = in.nextInt(), i, j;
        for (i = 2; i <= num; i++){
            for (j = 2; j < i; j++){
                if (i % j == 0)
                    break;
            }
            if (j == i)
                System.out.println(i);
        }
    }
}
