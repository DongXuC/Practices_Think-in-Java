/**
 * Created by XuChen on 2017/9/1.
 */

/*外部类可以访问内部类的所有数据成员，同样内部类也可访问外部类的所有数据成员*/

public class Project8 {
    class InnerP8 {
        private int num = 1;
    }

    void setNum() {
        InnerP8 test = new InnerP8();
        System.out.println(test.num);
        test.num = 0;
    }

    public static void main(String[] args) {
        Project8 p8 = new Project8();
        p8.setNum();
    }
}
