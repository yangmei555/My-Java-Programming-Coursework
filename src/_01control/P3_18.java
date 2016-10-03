package _01control;

/**
 * Created by admin on 2016/10/2.
 */
import java.util.Scanner;

public class P3_18 {
    public static void main(String args[]){
        System.out.print("Please enter month and day: ");
        Scanner in = new Scanner(System.in);
        int month, day;
        String season = " ";
        month = in.nextInt();
        day = in.nextInt();
        if (1 <= month && month <= 3)
            season = "Winter";
        else if (4 <= month && month <= 6)
            season = "Spring";
        else if (7 <= month && month <= 9)
            season = "Summer";
        else if (10 <= month && month <= 12)
            season = "Fall";
        if (month % 3 == 0 && day >= 21)
            if (season == "Winter")
                season = "Spring";
            else if (season == "Spring")
                season = "Summer";
            else if (season == "Summer")
                season = "Fall";
            else
                season = "Winter";
        System.out.println(season);
    }
}
