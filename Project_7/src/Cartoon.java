/**
 * Created by XuChen on 2017/7/29.
 */
class Art {
    Art() {
        System.out.println("Art");
    }
}
class Drawing extends Art {
    Drawing() {
        System.out.println("Drawing");
    }
}
public class Cartoon extends Drawing {
    public static void main(String[] args) {
        Cartoon cartoon = new Cartoon();
    }
}
