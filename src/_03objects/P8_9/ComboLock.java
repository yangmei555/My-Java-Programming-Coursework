package _03objects.P8_9;

/**
 * Created by yangmei555 on 2016/10/16.
 */
public class ComboLock {
    private int secret1, secret2, secret3;
    private static int times;
    private static int location[] = new int[3];
    private int current;
    public ComboLock(int secret1, int secret2, int secret3){
        this.secret1 = secret1;
        this.secret2 = secret2;
        this.secret3 = secret3;
    }
    public void reset(){
        current = 0;
        times = 0;
    }
    public void turnLeft(int ticks){
        current -= ticks;
        while (current < 0)
            current += 40;
        location[times] = current;
        times++;
    }
    public void turnRight(int ticks){
        current += ticks;
        while (current > 39)
            current -= 40;
        location[times] = current;
        times++;
    }
    public boolean open(){

        if (location[0] == secret1 && location[1] == secret2 && location[2] == secret3 )
            return true;
        else
            return false;
    }

}
