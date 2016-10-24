package _04interfaces.P9_23;

/**
 * Created by yangmei555 on 2016/10/23.
 */
public class Onetime extends Appointment{
    public Onetime(String d, int year, int month, int day){
        super(d, year, month, day);
    }
    public Onetime(){}
    public boolean occursOn(int year, int month, int day){
        if (year == getYear() && month == getMonth() && day == getDay()){
            return true;
        }
        else
            return false;
    }
}
