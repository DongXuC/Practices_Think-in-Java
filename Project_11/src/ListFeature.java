import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
/**
 * Created by XuChen on 2017/9/10.
 * Description:
 */
public class ListFeature {
    public static void main(String[] args) {
//        Random rand=new Random(47);
        List<Integer> list=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7));
        System.out.println("1: "+list+"打印容器");
        list.add(8);
        System.out.println("2; "+list+" ##.add()方法");
        System.out.println("3: "+list.contains(10)+" ##.contains()方法，基于Object类中的equals方法查找相同元素");
        list.remove(10);
        int buf=list.get(2);
        System.out.println("4: "+buf+" = "+list.indexOf(2)+"##.indexOf方法与.get方法，作用分别为由对象名称获取对象" +
                "以及由index获取对象");  /*两种获取容器中对象的方式*/


    }
}
