/**
 * Created by XuChen on 2017/7/19.
 */
public class ForTest_2 {
    public static void testBreak() {
        for (int i = 1; i <= 100; ++i) {
            if (i == 99) {
                break;
            }
        }
        System.out.println("Break Test!");
    }

    public static String testReturn() {
        for (int i = 1; i <= 100; ++i) {
            if (i == 99) {
                return "Return Test!";
            }
        }
        System.out.println("This should not be print");
        return " ";
    }
}
