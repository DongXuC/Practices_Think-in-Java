/**
 * Created by XuChen on 2017/7/24.
 */
public class StaticBlock {
    static String str_1 = "Hello world!_str_1";
    static String str_2;

    static {
        str_2 = "Hello world!_str_2";
    }

    static void print() {
        System.out.println("str_1 : " + str_1);
        System.out.println("str_2 : " + str_2);
    }
}
