import sun.java2d.pipe.OutlineTextRenderer;

/**
 * Created by XuChen on 2017/8/17.
 */
public class Outer {
    private String s = "Hello world!";

    class Inner {
        public String toString() {
            return s;
        }
    }

    public Inner getInner() {
        return new Inner();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.getInner();
        System.out.println(inner.toString());

    }
}
