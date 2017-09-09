/**
 * Created by XuChen on 2017/9/9.
 * Description:
 * 一定注意向上转型后调用子类重写的方法，使用的是子类方法的特性，
 * 但对于子类特有的方法，则无法调用
 */
public class TestClass {
    void method1() {
        System.out.println("method1");
    }
}
class TestClass2 extends TestClass {
    @Override
    void method1() {
        System.out.println("method2");
    }

    void method2() {

    }
}
class TestClass3 {
    public static void main(String[] args) {
        TestClass testClass = new TestClass2();
        testClass.method1();
//        testClass.method2();
    }
}
