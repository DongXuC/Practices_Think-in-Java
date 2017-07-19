/**
 * Created by XuChen on 2017/7/19.
 */
public class PrimeNumber {
    public static void generator(int max) {
        int buf = 0;
        for (int i = 0; i <= max; ++i) {
            for (int j = 2; j < i; ++j) {
                if ((i % j) == 0) {
                    ++buf;
                }
            }
            if (buf == 0) {
                System.out.println(i + " is a prime Number");
            }
            buf = 0;
        }
    }
}
