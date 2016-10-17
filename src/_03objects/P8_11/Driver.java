package _03objects.P8_11;

/**
 * Created by yangmei555 on 2016/10/16.
 */
public class Driver {
    public static void main(String[] args){
        Letter let = new Letter("John", "Mary");
        let.addLine("I am sorry we must part.");
        let.addLine("I wish you all the best.");
        String body = let.getText();
        System.out.println(body);
    }
}
