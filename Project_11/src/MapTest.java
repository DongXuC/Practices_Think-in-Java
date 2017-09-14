import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by XuChen on 2017/9/14.
 * Description: 一定注意Map的迭代器如何使用!!!!!!!!!
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String, Gerbil> testMap = new HashMap<String, Gerbil>();
        Map<String, Gerbil> linkedMap = new LinkedHashMap<String, Gerbil>();
        testMap.put("Gerbil_1", new Gerbil());
        testMap.put("Gerbil_2", new Gerbil());
        testMap.put("Gerbil_3", new Gerbil());
        testMap.put("Gerbil_4", new Gerbil());
        testMap.put("Gerbil_5", new Gerbil());
        testMap.put("Gerbil_6", new Gerbil());
        linkedMap.put("Gerbil_7",new Gerbil());
        linkedMap.put("Gerbil_8",new Gerbil());
        linkedMap.put("Gerbil_9",new Gerbil());
        linkedMap.put("Gerbil_10",new Gerbil());
        linkedMap.put("Gerbil_11",new Gerbil());
        linkedMap.put("Gerbil_12",new Gerbil());
        Iterator<Map.Entry<String, Gerbil>> it = testMap.entrySet().iterator();
        Iterator<Map.Entry<String, Gerbil>> it1 = linkedMap.entrySet().iterator();
        /*在希望同时用迭代器迭代key和value时，需要使用到Entry*/
        while (it.hasNext()) {
            Map.Entry<String, Gerbil> entry = it.next();
            System.out.println(entry.getKey() + " : ");
            entry.getValue().hop();     /*从打印结果可以看出HashMap存储时为随机排序*/
        }
        while (it1.hasNext()) {
            Map.Entry<String, Gerbil> entry1 = it1.next();
            System.out.println(entry1.getKey() + " : ");
            entry1.getValue().hop();     /*从打印结果可以看出LinkedHashMap为有序容器*/
        }
    }
}
