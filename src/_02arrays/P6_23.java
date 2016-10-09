package _02arrays;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

/**
 * Created by yangmei555 on 2016/10/7.
 */
public class P6_23 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number of the inputs: ");
        int n = in.nextInt();
        int i;
        ArrayList<String> captions = new ArrayList<String>();
        ArrayList<Double> values = new ArrayList<Double>();
        System.out.println("Please enter the captions of the inputs: ");
        for (i = 0; i < n; i++)
            captions.add(in.next());
        System.out.println("Please enter the values of the inputs: ");
        for (i = 0; i < n; i++)
            values.add(in.nextDouble());
        System.out.println();
        double max = -1;
        for (i = 0; i < n; i++)
            if (max < values.get(i))
                max = values.get(i);
        int maxlen = 0;
        for (i = 0; i < n; i++)
            if (maxlen < captions.get(i).length())
                maxlen = captions.get(i).length();
        for (i = 0; i < n; i++){
            System.out.printf("%" + maxlen + "s", captions.get(i));
            System.out.print(" ");
            int j;
            for (j = 0; j < Math.round(40 * values.get(i) / max); j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
