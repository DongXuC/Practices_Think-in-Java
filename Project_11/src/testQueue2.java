import java.util.PriorityQueue;

/**
 * Created by XuChen on 2017/9/15.
 * Description: 无法向PriorityQueue中添加多个继承于Object类的对象，程序运行后会报错
 * 报错信息如下：
 *Exception in thread "main" java.lang.ClassCastException: SimpleClass cannot be cast to java.lang.Comparable
 at java.util.PriorityQueue.siftUpComparable(PriorityQueue.java:652)
 at java.util.PriorityQueue.siftUp(PriorityQueue.java:647)
 at java.util.PriorityQueue.offer(PriorityQueue.java:344)
 at testQueue2.main(testQueue2.java:24)
 */
class SimpleClass {
    private static int buf = 0;
    private final int id;

    SimpleClass() {
        id = buf;
        ++buf;
    }

    void getID() {
        System.out.println(id);
    }
}
public class testQueue2 {
    public static void main(String[] args) {
        PriorityQueue<SimpleClass> test = new PriorityQueue<SimpleClass>();
        test.offer(new SimpleClass());
        test.offer(new SimpleClass());
        test.poll().getID();
        test.poll().getID();
    }

}
