package TestPackage3;

import TestPackage1.TestInterface;
import TestPackage2.TestClass2;

/**
 * Created by XuChen on 2017/9/1.
 */
public class TestClass3 extends TestClass2 {
    public TestInterface generator() {
        return new InnerTest();     /*此处TestClass2中的内部类InnerTest若没有构造函数，则此处会报错*/
    }

}
