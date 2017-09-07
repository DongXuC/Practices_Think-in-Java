/**
 * Created by XuChen on 2017/9/5.
 * Description:这里的嵌套类不需要创建其外围类对象，就如同静态方法一样，
 * 直接创建其对象
 */
public class Project18 {
    static class InnerClass {
        void method() {
            System.out.println("static InnerClass");
        }
    }

    public static void main(String[] args) {
        InnerClass test = new InnerClass();
        test.method();
    }
}
