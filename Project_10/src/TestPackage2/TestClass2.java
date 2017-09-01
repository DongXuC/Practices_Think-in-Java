package TestPackage2;

import TestPackage1.TestInterface;

/**
 * Created by XuChen on 2017/9/1.
 */
public class TestClass2 {
    protected class InnerTest implements TestInterface {
        public InnerTest() {
        }

        @Override
        public void method() {
            System.out.println("method()");
        }
    }
}
