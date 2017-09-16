/**
 * Created by XuChen on 2017/9/16.
 * Description:     在创建抛出异常的方法时，要在方法名后写明即将抛出异常的类型
 * 否则编译不通过，但可以在声明抛出异常后不抛出该异常。目的是为以后异常的添加提供便利
 */
public class Test8 {
    void f() {
//        throw new Exception("Error1");
    }

    void g() throws Exception {
        throw new Exception("Error2");
    }

    public static void main(String[] args) {
        Test8 test = new Test8();
        try {
            test.f();
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            test.g();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
