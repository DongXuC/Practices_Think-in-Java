/**
 * Created by XuChen on 2017/7/19.
 */
public class Fibonacci {
    public static void generator(int num) {
        int a1 = 1, a2 = 1;
        if (num < 3) {
            System.out.println("num must be bigger then 3!");
        }
        System.out.print(a1 + " " + a2);
        for (int i = 0; i < (num - 2); ++i) {
            int buf = a1 + a2;
            System.out.print(" " + buf);
            a1 = a2;
            a2 = buf;
        }
    }
}
