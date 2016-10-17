package _03objects.P8_8;

/**
 * Created by yangmei555 on 2016/10/16.
 */
public class Grade {
    double grade;
    public Grade(String grade){
        if (grade.equals("A"))
            this.grade = 4.0;
        else if (grade.equals("A-"))
            this.grade = 3.7;
        else if (grade.equals("B+"))
            this.grade = 3.3;
        else if (grade.equals("B"))
            this.grade = 3.0;
        else if (grade.equals("B-"))
            this.grade = 2.7;
        else if (grade.equals("C+"))
            this.grade = 2.3;
        else if (grade.equals("C"))
            this.grade = 2.0;
    }
}
