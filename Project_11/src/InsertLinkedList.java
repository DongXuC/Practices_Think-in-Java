import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by XuChen on 2017/9/14.
 * Description:
 */
public class InsertLinkedList {
    LinkedList<Integer> insert(int i, LinkedList<Integer> list) {
        int p = list.size() / 2;
        ListIterator<Integer> iterator = list.listIterator(p);
        iterator.add(i);
        return list;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        InsertLinkedList test = new InsertLinkedList();
        for (int i = 0; i < 5; ++i) {
            list.add(i);
        }
        System.out.println(list);
        for (int i = 0; i < 3; ++i) {
            list = test.insert(6, list);
        }
        System.out.println(list);
    }
}
