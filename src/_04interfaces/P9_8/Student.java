package _04interfaces.P9_8;

/**
 * Created by yangmei555 on 2016/10/23.
 */
public class Student extends Person{
    private String major;
    public Student(String n, int b, String m){
        super(n, b);
        major = m;
    }
    public String toString(){
        return "Student" + "[name=" + getname() + ", birthyear=" + getbirthyear() + ", major=" + major + "]";
    }
}
