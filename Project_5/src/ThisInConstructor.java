/**
 * Created by XuChen on 2017/7/24.
 */
public class ThisInConstructor {
    int i = 0;

    ThisInConstructor() {
        this("Hello world!");           //this调用构造函数必须在当前构造函数的第一行
        i = 233;
        System.out.println("Default constructor i = " + i);

    }

    String str = "Initial Value.";

    ThisInConstructor(String s) {
        str = s;
        System.out.println("i = " + i);
        System.out.println("Default constructor. str = " + str);
    }
}
