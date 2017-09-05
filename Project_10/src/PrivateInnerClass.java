import TestPackage1.TestInterface;

/**
 * Created by XuChen on 2017/9/2.
 * Description:
 */
public class PrivateInnerClass {
    private class InnerClass implements TestInterface {
        @Override
        public void method() {
            System.out.println("method()");
        }
    }

    public TestInterface getInnerClass() {
        return new InnerClass();
    }
}


class driver{
    public static void main(String[] args) {
        PrivateInnerClass test=new PrivateInnerClass();

    }
}