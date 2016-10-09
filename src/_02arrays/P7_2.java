package _02arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by yangmei555 on 2016/10/8.
 */
public class P7_2 {
    public static void main(String[] args)throws FileNotFoundException{
        Scanner read = new Scanner(System.in);
        System.out.println("Please enter the name of the input file: ");
        String inputfile = read.next();
        System.out.println("Please enter the name of the output file: ");
        String outputfile = read.next();
        PrintWriter out = new PrintWriter("src\\_02arrays\\" + outputfile);
        File inputFile = new File("src\\_02arrays\\" + inputfile);
        Scanner in = new Scanner(inputFile);
        int i = 1;
        while (in.hasNextLine()){
            out.print("/* " + i + " */ ");
            String str = in.nextLine();
            out.println(str);
            i++;
        }

        in.close();
        out.close();
    }
}
