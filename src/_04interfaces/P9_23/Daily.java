package _04interfaces.P9_23;

/**
 * Created by yangmei555 on 2016/10/23.
 */
public class Daily extends Appointment{
    public Daily(String d, int year, int month, int day){
        super(d, year, month, day);
    }
    public Daily(){}
    public boolean occursOn(int year, int month, int day){
        return true;
    }
}
