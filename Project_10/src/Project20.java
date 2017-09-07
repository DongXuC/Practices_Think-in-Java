/**
 * Created by XuChen on 2017/9/7.
 * Description:
 */
public interface Project20 {
    void method();

    class InnerClass implements Project20 {      /*这里为接口中的嵌套类，接口中的嵌套类默认为public和static的*/
        @Override
        public void method() {
            System.out.println("InnerClass method");
        }
    }
}
class Test implements Project20 {
    @Override
    public void method() {
        System.out.println("OutClass method");
    }

    public static void main(String[] args) {
        Test test = new Test();
        InnerClass innerClass = new InnerClass(); /*由于接口的嵌套类为静态类，因此可以直接创建该类的实例*/
        test.method();
        innerClass.method();
    }
}
