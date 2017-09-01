/**
 * Created by XuChen on 2017/9/1.
 */
public class Project7 {
    private int num = 0;

    private void testMethod() {
        System.out.println("TestMethod");
    }

    class InnerClass_P7 {
        void setNum(int i) {
            num = i;
        }

        void callMethod() {
            testMethod();
        }
    }

    InnerClass_P7 getInnerClass() {
        InnerClass_P7 i1 = new InnerClass_P7();
        i1.callMethod();
        i1.setNum(1);
        return i1;
    }

    public static void main(String[] args) {
        Project7 p7 = new Project7();
        p7.getInnerClass();
        System.out.println(p7.num);
    }
}
