import java.util.ArrayList;

/**
 * Created by XuChen on 2017/9/9.
 * Description:容器的基本使用
 *另：注意如何对某个类的创建次数进行计数
 */
public class Gerbil {
    static int id = 0;
    private final int gerbilNumber;

    Gerbil() {
        gerbilNumber = ++id;
    }

    public void hop() {
        System.out.println("Gerbil No." + gerbilNumber + " is jumping.");
    }
}
class driver1 {
    public static void main(String[] args) {
        ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();
        for (int i = 0; i < 10; i++) {
            gerbils.add(new Gerbil());
        }
        for (int i = 0; i < 10; ++i) {
            gerbils.get(i).hop();
        }
    }
}
