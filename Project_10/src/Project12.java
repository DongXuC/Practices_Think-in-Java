/**
 * Created by XuChen on 2017/9/4.
 * Description:匿名内部类不一定非要做返回值时使用
 */
public class Project12 {
    private int num = 0;

    private void method() {
        System.out.println("method()");
    }

    public void InnerMethod() {
        new Object() {
            void g() {
                num = 1;
                method();
            }
        }.g();
        System.out.println(num);
    }

    public static void main(String[] args) {
        Project12 p12 = new Project12();
        p12.InnerMethod();
    }
}
