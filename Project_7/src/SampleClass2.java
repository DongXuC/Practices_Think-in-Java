/**
 * Created by XuChen on 2017/7/29.
 */
public class SampleClass2 {
    public SampleClass1 class1;

    SampleClass2() {
        if (class1 == null) {
            class1 = new SampleClass1();
        }
    }

    SampleClass2(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        SampleClass2 class2=new SampleClass2("Hello world!");
        SampleClass2 class21=new SampleClass2();        /*此时实例class1才被创建*/
    }
}
