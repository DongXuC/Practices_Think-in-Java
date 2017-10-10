/**
 * Created by XuChen on 2017/10/10.
 * Description:注意Class对象的创建方式，Class对象的方法：
 * Class.forname("") //通过类名获取该类的Class对象         //注：这里的参数要从包名开始写
 * Class.isInterface()//判断是否为接口
 * Class.getSimpleName()//返回类名
 * Class.getCanonicalName()//从包名开始返回类名
 *
 */

interface HasBatteries{}
interface Waterproof{}
interface Shoots{}
interface testInterface{}

class Toy {
//    Toy() {           当注释掉父类的默认构造器，则无法使用.newInstance()方法，因为该方法调用默认构造器
//    }

    Toy(int i) {
    }
}

class FancyToy extends Toy implements HasBatteries,Waterproof,Shoots,testInterface {
    FancyToy() {
        super(1);
    }
}

public class ToyTest {
    static void printInfo(Class c) {
        System.out.println("Class name : " + c.getName() + " is interface ? [" + c.isInterface() + "]");
        System.out.println("Simple name : " + c.getSimpleName());
        System.out.println("CanonicalName : " + c.getCanonicalName());
    }

    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("FancyToy");
        } catch (ClassNotFoundException e) {
            System.out.println("Cannot find FancyToy");
            System.exit(1);
        }
        printInfo(c);
        for (Class face : c.getInterfaces()) {
            printInfo(face);
        }
        Class father = c.getSuperclass();
        Object o = null;
        try {
            o = father.newInstance();
        } catch (InstantiationException e) {
            System.out.println("Cannot instantiate");
            System.exit(1);
        } catch (IllegalAccessException e) {
            System.out.println("Cannot access");
            System.exit(1);
        }
        printInfo(o.getClass());
    }
}
