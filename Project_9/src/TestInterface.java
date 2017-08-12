/**
 * Created by XuChen on 2017/8/12.
 */

interface RootInterface {
    int I = 0;

    void method1();

    void method2();

    void method3();
}
class TestImplement implements RootInterface {
    @Override
    public void method1() {
        System.out.println(I + 1);
    }

    @Override
    public void method2() {
        System.out.println(I + 2);
    }

    @Override
    public void method3() {
        System.out.println(I + 3);
    }
}

public class TestInterface {
    public static void main(String[] args) {
        TestImplement test = new TestImplement();
        test.method1();
        test.method2();
        test.method3();
    }
}
