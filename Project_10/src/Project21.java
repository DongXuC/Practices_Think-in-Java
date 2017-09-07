/**
 * Created by XuChen on 2017/9/7.
 * Description:
 */
public interface Project21 {
    void method();

    class InnerClass implements Project21 {
        @Override
        public void method() {
            System.out.println("InnerClass method");
        }

        public static void getMethod() {
            InnerClass innerClass = new InnerClass();
            innerClass.method();
        }
    }
}

class Test1 implements Project21 {
    @Override
    public void method() {
        System.out.println("OuterClass method");
    }

    public static void main(String[] args) {
        InnerClass.getMethod();
    }
}

