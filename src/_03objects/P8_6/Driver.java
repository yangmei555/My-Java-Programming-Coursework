package _03objects.P8_6;

/**
 * Created by yangmei555 on 2016/10/16.
 */
public class Driver {
    public static void main(String[] args){
        Car myHybrid = new Car(50);
        myHybrid.addGas(20);
        myHybrid.drive(100);
        System.out.println(myHybrid.getGasLevel());
    }
}
