/**
 * Created by XuChen on 2017/9/4.
 * Description: 这里的匿名内部类相当于对原来类的重写
 */

public class P15Class1 {
    String words;
    public P15Class1(String s){
        words=s;
//        System.out.println(words);
    }
    void f(){
        System.out.println(words);
    }
}
class P15Class2{
    P15Class1 get(String s){
        return new P15Class1(s){
            @Override
            void f() {
                System.out.println(words+"Class2");
            }
        };
    }

    public static void main(String[] args) {
        P15Class2 test=new P15Class2();
        test.get("Hello world!").f();
    }
}
