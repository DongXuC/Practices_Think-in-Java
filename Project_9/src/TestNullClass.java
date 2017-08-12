/**
 * Created by XuChen on 2017/8/12.
 */
abstract class NullClass{
}

class TestClass1 extends NullClass {
    void print() {
        System.out.println("TestClass1.print()");
    }
}

abstract class WithMethod {
    abstract void print();
}

class TestClass2 extends WithMethod {
    @Override
    void print() {
        System.out.println("TestClass2.print()");
    }
}

public class TestNullClass {
    public static void test1(NullClass n) {
        ((TestClass1) n).print();
    }

    public static void test2(WithMethod n) {
        n.print();
        /*对比是否在父类中声明抽象方法，若在父类中声明抽象方法，
        则对父类对象（并不是抽象类的对象，而是父类的引用）不需要向下转型，
        就可以调用子类方法*/
    }

    public static void main(String[] args) {
        NullClass n1 = new TestClass1();      /*这是父类的引用，而非父类的对象*/
        WithMethod n2 = new TestClass2();
        test1(n1);
        test2(n2);
    }
}
