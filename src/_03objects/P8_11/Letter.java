package _03objects.P8_11;

import java.util.ArrayList;

/**
 * Created by yangmei555 on 2016/10/16.
 */
public class Letter {
    private String letter, from, to;

    public Letter(String from, String to){
        this.from = from;
        this.to = to;
        letter = "Dear " + this.from + ":\n" + "\n";
    }
    public void addLine(String line){
        letter += line + "\n";
    }
    public String getText(){
        letter += "\n" + "Sincerely," + "\n\n" + to;
        return letter;
    }
}
