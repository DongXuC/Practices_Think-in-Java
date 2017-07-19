/**
 * Created by XuChen on 2017/7/19.
 */
public class IfElse {
    public static int test(int testval, int target, int begin, int end) {
        if (testval == target) {
            if (testval < end && testval > begin) {
                System.out.println(testval + " is between " + begin + " and " + end);
            } else {
                System.out.println(testval + " is not between " + begin + " and " + end);
            }
            return 0;
        } else if (testval > target) {
            if (testval < end && testval > begin) {
                System.out.println(testval + " between " + begin + " and " + end);
            } else {
                System.out.println(testval + " not between " + begin + " and " + end);
            }
            return +1;
        } else {
            if (testval < end && testval > begin) {
                System.out.println(testval + " between " + begin + " and " + end);
            } else {
                System.out.println(testval + " not between " + begin + " and " + end);
            }
            return -1;
        }
    }
}
