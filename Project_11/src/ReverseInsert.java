import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by XuChen on 2017/9/12.
 * Description: 在使用迭代器时一定注意，当与直接操作容器内元素混用时，对导致迭代器没有更新
 * 尤其是与remove一同使用时
 */
public class ReverseInsert {
    List<Integer> start(List<Integer> list1, List<Integer> list2) {
        int l1 = list1.size();
        int l2 = list2.size();
        ListIterator<Integer> iterator1 = list1.listIterator(l1);
        ListIterator<Integer> iterator2 = list2.listIterator(l2);
//        System.out.println(iterator.previous());
        while (iterator1.hasPrevious()) {
//            list2.add(i);               /*向list2中添加元素会报错*/
            iterator2.add((int) iterator1.previous());
//            System.out.println(iterator.previous());
        }
        return list2;
    }

    public static void main(String[] args) {
        ReverseInsert insert = new ReverseInsert();
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        for (int i = 0; i < 6; ++i) {
            list1.add(i);
        }
        list2 = list1;
        list2 = insert.start(list1, list2);
        System.out.println(list2);
    }
}
