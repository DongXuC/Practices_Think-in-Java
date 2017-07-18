/**
 * Created by XuChen on 2017/7/18.
 */
import java.util.*;
public class CallHeadsOrTails {
    public static void Start(){
        Random random=new Random();     /*random类在不设定seed的情况下会根据当前时间随机生成，若设定seed则只随机生成一次*/
        if (random.nextBoolean()) System.out.println("正面");
        else System.out.println("反面");
    }
}
