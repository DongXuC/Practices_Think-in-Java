/**
 * Created by XuChen on 2017/7/29.
 */
public class Detergent {
    protected String str = "Detergent ";

    public void append(String word) {
        System.out.println(str += word);
    }

    public void scrub() {
        append("scrub");
    }
}
