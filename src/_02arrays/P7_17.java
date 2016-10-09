package _02arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by yangmei555 on 2016/10/8.
 */
public class P7_17 {
    public static void main(String[] args)throws FileNotFoundException{
        int[] sum = {0, 0, 0, 0};
        File inputFile = new File("src\\_02arrays\\P7_17_input.txt");
        Scanner in = new Scanner(inputFile);
        PrintWriter out1 = new PrintWriter("src\\_02arrays\\Dinner.txt");
        PrintWriter out2 = new PrintWriter("src\\_02arrays\\Conference.txt");
        PrintWriter out3 = new PrintWriter("src\\_02arrays\\Lodging.txt");
        PrintWriter out4 = new PrintWriter("src\\_02arrays\\Lunch.txt");
        out1.println("The total amout of Dinner is: ");
        out2.println("The total amout of Conference is: ");
        out3.println("The total amout of Lodging is: ");
        out4.println("The total amout of Lunch is: ");

        while (in.hasNextLine()){
            String str = new String();
            String str2 = new String();
            String str3 = new String();
            if (in.hasNext())
                str2 = in.next();
            if (in.hasNext())
                str3 = in.next();
            if (in.hasNext())
                str = in.next();

            if (str.equals("Dinner")) {
                if (in.hasNext())
                    str = in.next();
                sum[0] += in.nextInt();
            } else if (str.equals("Conference")) {
                if (in.hasNext())
                    str = in.next();
                sum[1] += in.nextInt();
            } else if (str.equals("Lodging")) {
                if (in.hasNext())
                    str = in.next();
                sum[2] += in.nextInt();
            } else if (str.equals("Lunch")) {
                if (in.hasNext())
                    str = in.next();
                sum[3] += in.nextInt();
            }

        }
        out1.println(sum[0]);
        out2.println(sum[1]);
        out3.println(sum[2]);
        out4.println(sum[3]);

        in.close();
        out1.close();
        out2.close();
        out3.close();
        out4.close();
    }
}
