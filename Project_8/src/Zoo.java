import java.util.Random;

/**
 * Created by XuChen on 2017/8/11.
 */
class Rodent {
    void cute() {
        System.out.println("Rodent.cute()");
        run();
    }

    void run() {
        System.out.println("Rodent.run()");
    }
}

class Mouse extends Rodent {
    void run() {
        System.out.println("Mouse.run()");
    }
}

class Gerbil extends Rodent {
    void run() {
        System.out.println("Gerbil.run()");
    }
}

public class Zoo {
    public static void show(Rodent i) {
        i.cute();
    }

    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        show(mouse);
    }
}
