import TestPackage1.TestInterface;

/**
 * Created by XuChen on 2017/9/2.
 * Description: 局部内部类，要分清局部内部类的作用
 * 局部内部类继承了一个接口，使得外部方法可以返回一个接口类型的对象。
 * 具体用处没想出来。
 */
public class Project9 {
    public TestInterface getInterface() {
        class InnerClass implements TestInterface {
            @Override
            public void method() {
                System.out.println("method()");
            }
        }
        return new InnerClass();
    }

    public static void main(String[] args) {
        Project9 p9 = new Project9();
        TestInterface testInterface = p9.getInterface();
    }
}
