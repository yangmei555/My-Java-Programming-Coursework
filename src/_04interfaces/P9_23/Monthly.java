package _04interfaces.P9_23;

/**
 * Created by yangmei555 on 2016/10/23.
 */
public class Monthly extends Appointment {
    public Monthly(String d, int year, int month, int day){
        super(d, year, month, day);
    }
    public Monthly(){}
    public boolean occursOn(int year, int month, int day){
        if (day == getDay()){
            return true;
        }
        else
            return false;
    }
}
