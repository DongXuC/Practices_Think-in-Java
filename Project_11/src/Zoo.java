import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * Created by XuChen on 2017/9/12.
 * Description:
 * Exception in thread "main" java.util.ConcurrentModificationException
 at java.util.ArrayList$Itr.checkForComodification(ArrayList.java:901)
 at java.util.ArrayList$Itr.next(ArrayList.java:851)
 at Zoo.main(Zoo.java:52)
程序会报错如下内容，还没有解决
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

class Gerbil1 extends Rodent {
    void run() {
        System.out.println("Gerbil.run()");
    }
}

public class Zoo {
    public static void show(Rodent i) {
        i.cute();
    }

    Rodent randomGenerator() {
        Random random = new Random(47);
        List<Rodent> list = new ArrayList<Rodent>();
        list.add(new Mouse());
        list.add(new Gerbil1());
        return list.get(random.nextInt(1));
    }

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        List<Rodent> list = new ArrayList<Rodent>();
        Iterator<Rodent> iterator = list.iterator();  /*创建迭代器*/
        for (int i = 0; i < 5; ++i) {
            list.add(zoo.randomGenerator());
        }
        while (iterator.hasNext()) {
            iterator.next().run();
        }
    }
}