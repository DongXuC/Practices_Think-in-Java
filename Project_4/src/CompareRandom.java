/**
 * Created by XuChen on 2017/7/19.
 */
import java.util.*;
public class CompareRandom {
    static void Compare() {
        Random random = new Random(47);
        int first_num = random.nextInt();
        for (int i = 0; i < 25; ++i) {
            int buf = random.nextInt();
            if (buf == first_num) {
                System.out.println(buf + " = " + first_num);
            } else if (buf < first_num) {
                System.out.println(buf + " < " + first_num);
            } else {
                System.out.println(buf + " > " + first_num);
            }
            first_num = buf;
        }
    }

    static void Compare_infinite() {
        Random random = new Random(47);
        int first_num = random.nextInt();
        while (true) {
            int buf = random.nextInt();
            if (buf == first_num) {
                System.out.println(buf + " = " + first_num);
            } else if (buf < first_num) {
                System.out.println(buf + " < " + first_num);
            } else {
                System.out.println(buf + " > " + first_num);
            }
            first_num = buf;
        }
    }
}
