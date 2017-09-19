import java.util.ArrayList;
import java.util.List;

/**
 * Created by XuChen on 2017/9/19.
 * Description: 每个容器都有自己的tostring方法，调用容器的tostring方法会分别调用容器内每个元素的tostring方法
 *
 */
public class InfiniteRecursion {
    public String tostring() {
        return "InfiniteRecursion address : " + super.toString() + "\n";
    }

    public static void main(String[] args) {
        List<InfiniteRecursion> list = new ArrayList<InfiniteRecursion>();
        for (int i = 0; i < 4; ++i) {
            list.add(new InfiniteRecursion());
        }
        System.out.println(list);
    }
}
