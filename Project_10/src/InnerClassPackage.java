/**
 * Created by XuChen on 2017/9/5.
 * Description:  在嵌套类中的嵌套类，无需创建上一级对象，但需要说明属于哪一级
 *
 * 注意正常内部类的创建形式
 */
public class InnerClassPackage {
    class TestClass1{
        void method1(){
            System.out.println("method1");
        }
        class TestClass2{
            void method2(){
                System.out.println("method2");
            }
        }
    }
    static class TestClass3{
        void method3(){
            System.out.println("method3");
        }
        static class TestClass4{
            void method4(){
                System.out.println("method4");
            }
        }
    }

    public static void main(String[] args) {
//        TestClass1 test1=new TestClass1();
//        TestClass2 test1=new TestClass2();
        TestClass3 testClass3=new TestClass3();
        testClass3.method3();
        TestClass3.TestClass4 testClass4=new TestClass3.TestClass4();
        InnerClassPackage innerClassPackage=new InnerClassPackage();
        InnerClassPackage.TestClass1 testClass1=innerClassPackage.new TestClass1();
        InnerClassPackage.TestClass1.TestClass2 testClass2=testClass1.new TestClass2();
    }
}
