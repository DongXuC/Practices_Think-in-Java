/**
 * Created by XuChen on 2017/7/24.
 */
public class InitialString {
    String str_1;
    String str_2 = "Hello world!";
    String str_3;

    InitialString() {
        str_3 = "Hello world!";       //构造函数不应该生成变量，构造函数的作用是初始化。
    }
}
