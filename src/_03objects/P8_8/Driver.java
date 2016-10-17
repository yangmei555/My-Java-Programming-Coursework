package _03objects.P8_8;

/**
 * Created by yangmei555 on 2016/10/16.
 */
public class Driver {
    public static void main(String[] args){
        Student s1 = new Student("John");
        s1.addQuiz(100);
        s1.addQuiz(90);
        s1.addQuiz(80);
        System.out.println(s1.getTotalScore());
        System.out.println(s1.getAverageScore());
        Student s2 = new Student("Mary");
        s2.addGrade(new Grade("A"));
        s2.addGrade(new Grade("A-"));
        s2.addGrade(new Grade("B+"));
        System.out.printf("%.2f", s2.getCurrentGPA());
    }
}
