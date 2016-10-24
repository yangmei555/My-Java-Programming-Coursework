package _04interfaces.P9_23;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by yangmei555 on 2016/10/23.
 */
public class Driver {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner in = new Scanner(System.in);
        ArrayList<Appointment> ap = new ArrayList<>();
        ap.add(new Daily("study", 2016, 10, 1));
        ap.add(new Monthly("see the dentist", 2016, 10, 8));
        ap.add(new Onetime("go shopping", 2016, 10, 10));
        boolean stop = true;
        while (stop){
            System.out.println("If you want to search, enter 1");
            System.out.println("If you want to add new appointments, enter 2");
            System.out.println("If you want to save, enter 3");
            System.out.println("If you want to load, enter 4");
            System.out.println("If you want to search, enter 5");
            int n = in.nextInt();
            if (n == 1){
                System.out.println("Please enter year, month, day: ");
                int year = in.nextInt();
                int month = in.nextInt();
                int day = in.nextInt();
                for (Appointment app : ap) {
                    if (app.occursOn(year, month, day))
                        System.out.println(app.getDes());
                }
            }
            if (n == 2){
                System.out.println("Please enter the type of appointment, the description, " +
                        "and the year, month, day");
                String str = in.next();
                if (str.equals("Daily")){
                    String str2 = in.next();
                    int year = in.nextInt();
                    int month = in.nextInt();
                    int day = in.nextInt();
                    ap.add(new Daily(str2, year, month, day));
                }
                if (str.equals("Monthly")){
                    String str2 = in.next();
                    int year = in.nextInt();
                    int month = in.nextInt();
                    int day = in.nextInt();
                    ap.add(new Monthly(str2, year, month, day));
                }
                if (str.equals("Onetime")){
                    String str2 = in.next();
                    int year = in.nextInt();
                    int month = in.nextInt();
                    int day = in.nextInt();
                    ap.add(new Onetime(str2, year, month, day));
                }
            }
            if (n == 3){
                System.out.println("Please enter the index of the appointment that you want " +
                        "to save: ");
                int no = in.nextInt();
                save(ap.get(no - 1));
            }
            if (n == 4){
                System.out.println("Please enter the type of the appointment that you want " +
                        "to load: ");
                String str = in.next();
                Appointment appp;
                if (str.equals("Daily"))
                    appp = new Daily();
                else if (str.equals("Monthly"))
                    appp = new Monthly();
                else
                    appp = new Onetime();
                ap.add(load(appp));
            }
            if (n == 5)
                stop = false;
        }
    }
    public static void save(Appointment app) throws FileNotFoundException {
        Scanner read = new Scanner(System.in);
        System.out.println("Please enter the name of the output file: ");
        String outputfile = read.next();
        PrintWriter out = new PrintWriter("src\\_04interfaces\\P9_23\\" + outputfile);
        String str = new String();
        if (app instanceof Daily)
            str = "Daily";
        else if (app instanceof Monthly)
            str = "Monthly";
        else if (app instanceof Onetime)
            str = "Onetime";
        out.println(str + " " + app.getDes() + " " + app.getYear() + " " + app.getMonth() + " " + app.getDay());
    }

    public static Appointment load(Appointment app) throws FileNotFoundException {
        Scanner read = new Scanner(System.in);
        System.out.println("Please enter the name of the input file: ");
        String inputfile = read.next();
        File inputFile = new File("src\\_04interfaces\\P9_23\\" + inputfile);
        if (app instanceof Daily){
            Scanner in = new Scanner(inputFile);
            return new Daily(in.next(), in.nextInt(), in.nextInt(), in.nextInt());
        }
        else if (app instanceof Monthly){
            Scanner in = new Scanner(inputFile);
            return new Monthly(in.next(), in.nextInt(), in.nextInt(), in.nextInt());
        }
        else{
            Scanner in = new Scanner(inputFile);
            return new Onetime(in.next(), in.nextInt(), in.nextInt(), in.nextInt());
        }
    }
}
