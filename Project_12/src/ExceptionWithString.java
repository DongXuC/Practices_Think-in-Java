/**
 * Created by XuChen on 2017/9/16.
 * Description:
 */
public class ExceptionWithString {
    public static void main(String[] args) {
        try {
            throw new Exception("Hello error!");
        } catch (Exception e) {
            System.out.println("e.getMessage() = " + e.getMessage());
        } finally {
            System.out.println("This can run finally.");
        }

    }
}
