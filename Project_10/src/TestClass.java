/**
 * Created by XuChen on 2017/9/1.
 */

/*在一个单独的类中创建一个内部类的实例*/

class OuterClass {
    public OuterClass() {
        System.out.println("Outer class");
    }

    class InnerClass {
        public InnerClass() {
            System.out.println("Inner class");
        }
    }
}

public class TestClass {
    public static void main(String[] args) {
        OuterClass test1 = new OuterClass();
        OuterClass.InnerClass test = test1.new InnerClass();

    }
}
