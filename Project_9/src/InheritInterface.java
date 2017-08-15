/**
 * Created by XuChen on 2017/8/14.
 */

interface TestInterface1 {
    void method1();

    void method2();
}

interface TestInterface2 {
    void method3();

    void method4();
}

interface TestInterface3 {
    void method5();

    void method6();
}

interface TestInterface4 extends
        TestInterface1,TestInterface2,TestInterface3 {
    void method7();
}

abstract class TestClass {
    abstract void print();
}

public class InheritInterface extends TestClass implements TestInterface4 {
    @Override
    public void method1() {
        System.out.println("method1()");
    }

    @Override
    public void method2() {
        System.out.println("method2()");
    }

    @Override
    public void method3() {
        System.out.println("method3()");
    }

    @Override
    public void method4() {
        System.out.println("method4()");
    }

    @Override
    public void method5() {
        System.out.println("method5()");
    }

    @Override
    public void method6() {
        System.out.println("method6()");
    }

    @Override
    public void method7() {
        System.out.println("method7()");
    }

    public static void testMethod1(TestInterface1 t1) {
        t1.method1();
        t1.method2();
    }

    public static void testMethod2(TestInterface2 t2) {
        t2.method3();
        t2.method4();
    }

    public static void testMethod3(TestInterface3 t3) {
        t3.method5();
        t3.method6();
    }

    @Override
    void print() {
        System.out.println("TestClass");
    }

    public static void testMethod4(TestInterface4 t4) {
        t4.method7();
    }

    public static void main(String[] args) {
        InheritInterface test=new InheritInterface();
        testMethod1(test);
        testMethod2(test);
        testMethod3(test);
        testMethod4(test);
        test.print();
    }
}
