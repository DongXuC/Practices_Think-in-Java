import java.util.PriorityQueue;
import java.util.Random;

/**
 * Created by XuChen on 2017/9/15.
 * Description:     PriorityQueue为带权重的队列，遵守先进先出原则（这里的先出是指权重的元素先出）
 * Queue接口及PriorityQueue在并发程序中非常重要
 */
public class testQueue {
    public static void main(String[] args) {
        Random random = new Random();
        PriorityQueue<Double> queue = new PriorityQueue<Double>();
        for (int i = 0; i < 10; ++i) {
            queue.offer(random.nextDouble());
        }
        System.out.println(queue);
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
//            System.out.println(queue);
        }
    }
}
