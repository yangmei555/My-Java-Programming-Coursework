package _03objects.P8_9;

/**
 * Created by yangmei555 on 2016/10/16.
 */
public class Driver {
    public static void main(String[] args){
        ComboLock lock = new ComboLock(5, 3, 7);
        lock.reset();
        lock.turnRight(4);
        lock.turnLeft(2);
        lock.turnRight(9);
        System.out.println(lock.open());
        System.out.println();
        lock.reset();
        lock.turnRight(5);
        lock.turnLeft(2);
        lock.turnRight(4);
        System.out.println(lock.open());
    }

}
