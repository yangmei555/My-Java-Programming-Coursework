package _03objects.P8_4;

/**
 * Created by yangmei555 on 2016/10/16.
 */
public class Driver {
    public static void main(String[] args){
        Address ad1 = new Address(5201, "South Cornell Avenue", "3C", "Chicago", "Illinois", 60615);
        Address ad2 = new Address(5254, "South Drexel Avenue", "Chicago", "Illinois", 60637);
        ad1.print();
        System.out.println();
        ad2.print();
        System.out.println();
        if (ad1.comesBefore(ad2) == true)
            System.out.println("ad1 comes before ad2.");
        else
            System.out.println("ad2 comes before ad1.");
    }
}
