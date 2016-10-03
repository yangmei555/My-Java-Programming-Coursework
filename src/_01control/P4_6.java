package _01control;

/**
 * Created by admin on 2016/10/2.
 */
import java.util.Scanner;
public class P4_6 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the inputs, terminate with entering \"quit\": ");
        boolean first = true;
        int n, min = 0, i;
        while (!in.hasNext("quit")){
            n = in.nextInt();
            if (first == true){
                min = n;
                first = false;
            }
            else if (n < min)
                min = n;
        }
        System.out.println("The minimum value is: " + min);
    }
}
