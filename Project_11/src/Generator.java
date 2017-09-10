import java.util.*;

/**
 * Created by XuChen on 2017/9/10.
 * Description:
 */
public class Generator {
    private String list[] = {"Snow White", "Star War", "movie1", "movie2"};
    private static int index = 0;

    String next() {
        if (index == list.length) {
            index = 0;
        }
        return list[index++];
    }
}

class test1 {
    public static void main(String[] args) {
        Collection<String> str1 = new ArrayList<String>();
        Collection<String> str2 = new LinkedList<String>();
        Collection<String> str3 = new HashSet<String>();
        Collection<String> str4 = new LinkedHashSet<String>();
        Generator generator = new Generator();
        for (int i = 0; i < 4; ++i) {
            str1.add(generator.next());
            str2.add(generator.next());
            str3.add(generator.next());
            str4.add(generator.next());
        }
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
    }
}
