package _06design.P12_8;

/**
 * Created by yangmei555 on 2016/11/5.
 */
public class Coin {
    double money = 0;
    public Coin(int n){
        if (n == 1)
            money = 0.01;
        else if (n == 2)
            money = 0.05;
        else if (n == 3)
            money = 0.10;
        else if (n == 4)
            money = 0.25;
        else if (n == 5)
            money = 0.50;
        else if (n == 6)
            money = 1;
    }
    public double getMoney(){
        return money;
    }
}
