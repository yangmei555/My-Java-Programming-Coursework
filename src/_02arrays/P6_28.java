package _02arrays;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by yangmei555 on 2016/10/7.
 */
public class P6_28 {
    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        System.out.println("Please input array list a: ");
        InputStream in = System.in;
        Scanner s = new Scanner(in);
        Scanner t = new Scanner(s.nextLine());
        while (t.hasNextInt()){
            a.add(t.nextInt());
        }
        System.out.println("Please input array list b: ");
        InputStream inn = System.in;
        Scanner ss = new Scanner(inn);
        Scanner tt = new Scanner(ss.nextLine());
        while (tt.hasNextInt()){
            b.add(tt.nextInt());
        }

        ArrayList<Integer> c = new ArrayList<>(mergeSorted(a, b));
        System.out.println();
        System.out.println("The merged array list is: ");
        for (int i = 0; i < c.size(); i++){
            System.out.print(c.get(i) + " ");
        }
        System.out.println();
    }

    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b){
        int i;
        ArrayList<Integer> merge = new ArrayList<>();
        a.add(1000000);
        b.add(1000000);
        int j  = 0, k = 0;
        for (i = 0; i < a.size() + b.size() - 2; i++){
            if (a.get(j) < b.get(k)){
                merge.add(a.get(j));
                j++;
            } else {
                merge.add(b.get(k));
                k++;
            }
        }
        return merge;
    }
}
