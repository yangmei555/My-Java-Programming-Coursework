package _03objects.P8_8;

/**
 * Created by yangmei555 on 2016/10/16.
 */
public class Student {
    private String name;
    int total, number, number2;
    double gpa;
    public Student(String name){
        this.name = name;
    }
    public void addQuiz(int score){
        total += score;
        number++;
    }
    public int getTotalScore(){
        return total;
    }
    public double getAverageScore(){
        return (double)total / number;
    }
    public void addGrade(Grade gra){
        gpa += gra.grade;
        number2++;
    }
    public double getCurrentGPA(){
        return gpa / number2;
    }
}
