package _03objects.P8_6;

/**
 * Created by yangmei555 on 2016/10/16.
 */
public class Car {
    private double efficiency;
    private double gas;
    public Car(double efficiency){
        this.efficiency = efficiency;
        gas = 0;
    }
    public void addGas(double gas){
        this.gas += gas;
    }
    public void drive(double mile){
        this.gas -= mile / efficiency;
    }
    public double getGasLevel(){
        return gas;
    }
}
