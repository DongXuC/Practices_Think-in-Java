/**
 * Created by XuChen on 2017/7/18.
 */
//import org.omg.PortableInterceptor.DISCARDING;

import java.util.*;
public class EverageSpeed {
    Random random = new Random(47);
    int DISTANCE = random.nextInt(100);
    int TIME = random.nextInt(100) + 1;

    double Speed() {            //这里的方法不能声明为静态，因为程序先创建static方法，此时非静态成员还未被创建        System.out.println("Distance = "+ DISTANCE);
        System.out.println("Distance = " + DISTANCE + " ; " + "Time = " + TIME);
        double speed = DISTANCE / TIME;
        System.out.println("Speed = " + speed);
        return speed;
    }
}
