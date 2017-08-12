/**
 * Created by XuChen on 2017/8/12.
 */
abstract class RootClass {
    abstract void print();

    RootClass() {
        print();
    }
}

class InheritClass extends RootClass {
    //    private int i = 1;
//    int i = 1;
    public int i = 1;

    @Override
    void print() {
        System.out.println(i);
    }
}

public class TestPrint {
    public static void main(String[] args) {
        InheritClass test = new InheritClass();       /*可以看出抽象类本身不能创建对象，只能通过子类*/
                                                    /*因此，父类构造函数中可以含有抽象方法，因为抽象方法必会在子类中初始化*/
    }
}
