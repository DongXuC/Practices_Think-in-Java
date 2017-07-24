/**
 * Created by XuChen on 2017/7/24.
 */
public class Cups {
    static Cup cup1;
    static Cup cup2;

    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }

    Cups() {
        System.out.println("Cups()");
    }
}
class Cup {
    Cup(int maker) {
        System.out.println("Cup( " + maker + " )");
    }

    void f1(int maker) {
        System.out.println("f( " + maker + " )");
    }
}
