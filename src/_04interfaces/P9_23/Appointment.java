package _04interfaces.P9_23;

/**
 * Created by yangmei555 on 2016/10/23.
 */
public class Appointment {
    private String des;
    private int year, month, day;
    public Appointment(String d, int year, int month, int day){
        this.des = d;
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public Appointment(){}
    public int getYear(){
        return year;
    }
    public int getMonth(){
        return month;
    }
    public int getDay(){
        return day;
    }
    public String getDes(){
        return des;
    }
    public boolean occursOn(int year, int month, int day){
        return true;
    }
}
