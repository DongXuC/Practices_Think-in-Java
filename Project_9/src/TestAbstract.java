/**
 * Created by XuChen on 2017/8/12.
 */
abstract class NonAbstractMethod {
    void print() {
        System.out.println("Test.");
    }
//    abstract void test();
}

public class TestAbstract {
    public static void main(String[] args) {
//        NonAbstractMethod test=new NonAbstractMethod();       没有抽象方法的抽象类不能被实例化
//        有抽象方法则必须对抽象方法进行重写
    }
}
