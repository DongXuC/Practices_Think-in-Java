/**
 * Created by XuChen on 2017/8/12.
 */
public class Test {
    public static void main(String[] args) {
        TestImplement testImplement=new TestImplement();    /*接口与类相同，需要被显式的声明为public
                                                            但接口内的方法默认为public*/
        testImplement.method3();
        String s="Hello";
        System.out.println(s.charAt(1));
    }
}
