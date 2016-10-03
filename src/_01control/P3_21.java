package _01control;

/**
 * Created by admin on 2016/10/2.
 */
import java.util.Scanner;

public class P3_21 {
    public static void main(String args[]){
        System.out.print("Please enter your income: ");
        Scanner in = new Scanner(System.in);
        double income = in.nextDouble();
        double tax;
        if (income <= 50000)
            tax = income * 0.01;
        else if (income <= 75000)
            tax = (income - 50000) * 0.02 + 50000 * 0.01;
        else if (income <= 100000)
            tax = (income - 75000) * 0.03 + 50000 * 0.01 + 25000 * 0.02;
        else if (income <= 250000)
            tax = (income - 100000) * 0.04 + 50000 * 0.01 + 25000 * 0.02 + 25000 * 0.03;
        else if (income <= 500000)
            tax = (income - 250000) * 0.05 + 50000 * 0.01 + 25000 * 0.02 + 25000 * 0.03 + 150000 * 0.04;
        else
            tax = (income - 500000) * 0.06 + 50000 * 0.01 + 25000 * 0.02 + 25000 * 0.03 + 150000 * 0.04 + 250000 * 0.05;
        System.out.println("The tax is: " + tax);
    }
}