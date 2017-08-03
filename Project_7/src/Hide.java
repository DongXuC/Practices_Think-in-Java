/**
 * Created by XuChen on 2017/7/31.
 */
public class Hide {
    public void display() {
        System.out.println("Hide");
    }

    public void display(int i) {
        System.out.println("Hide " + i);
    }

    public void display(String str) {
        System.out.println("Hide " + str);
    }
}
class Test extends Hide {
    public void display(float f) {
        System.out.println("Hide " + f);
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.display();
        test.display(1);
        test.display("hello");
        test.display(1.1f);
    }
}


