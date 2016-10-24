package _04interfaces.P9_8;

/**
 * Created by yangmei555 on 2016/10/23.
 */
public class Driver {
    public static void main(String[] args) {
        Person p = new Person("Mike", 1993);
        Student s = new Student("Alice", 1994, "Math");
        Instructor i = new Instructor("Sarah", 1980, 8000);
        String str1 = p.toString();
        String str2 = s.toString();
        String str3 = i.toString();
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
