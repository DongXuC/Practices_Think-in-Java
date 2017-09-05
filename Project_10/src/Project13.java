import TestPackage1.TestInterface;

/**
 * Created by XuChen on 2017/9/4.
 * Description:若匿名内部类需要继承，则需要向上转型
 */
public class Project13 {
    public TestInterface getInnerClass() {
        return new TestInterface() {
            @Override
            public void method() {
                System.out.println("Project13 method()");
            }
        };
    }

    public static void main(String[] args) {
        Project13 p13 = new Project13();
        p13.getInnerClass().method();
    }
}
