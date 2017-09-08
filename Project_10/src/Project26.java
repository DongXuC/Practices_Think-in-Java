/**
 * Created by XuChen on 2017/9/8.
 * Description:
 */

class P26OuterClass {
    class InnerClass1 {
        InnerClass1(String s) {
            System.out.println(s);
        }
    }
}

public class Project26 {
    class InnerClass2 extends P26OuterClass.InnerClass1 {
        InnerClass2(P26OuterClass p, String s) {
            p.super(s);
        }
    }

    public static void main(String[] args) {
        P26OuterClass p26OuterClass=new P26OuterClass();
        Project26 project26=new Project26();
        Project26.InnerClass2 innerClass2=project26.new InnerClass2(p26OuterClass,"Hello world!");
    }
}
