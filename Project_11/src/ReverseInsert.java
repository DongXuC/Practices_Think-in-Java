import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by XuChen on 2017/9/12.
 * Description:
 */
public class ReverseInsert {
    void start(List<Integer> list1,List<Integer> list2){
        ListIterator<Integer> iterator=list1.listIterator(list1.size());
//        System.out.println(iterator.previous());
        while (iterator.hasPrevious()){
            Integer i=iterator.previous();
            list2.add(i);               /*向list2中添加元素会报错*/
//            System.out.println(iterator.previous());
        }
    }
    public static void main(String[] args) {
        ReverseInsert insert=new ReverseInsert();
        List<Integer> list1=new ArrayList<Integer>();
        List<Integer> list2=new ArrayList<Integer>();
        for (int i=0;i<6;++i){
            list1.add(i);
        }
        list2=list1;
        insert.start(list1,list2);
        System.out.println(list2);
    }
}
