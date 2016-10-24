package _04interfaces.P9_8;

/**
 * Created by yangmei555 on 2016/10/23.
 */
public class Person {
    private String name;
    private int birthyear;
    public Person(String n, int b){
        name = n;
        birthyear = b;
    }
    public String toString(){
        return "Person" + "[name=" + name + ", birthyear=" + birthyear +"]";
    }
    public String getname(){
        return name;
    }
    public int getbirthyear(){
        return birthyear;
    }
}

