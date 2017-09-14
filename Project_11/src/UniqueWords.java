import net.mindview.util.TextFile;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by XuChen on 2017/9/14.
 * Description:
 */
public class UniqueWords {
    public static void main(String[] args) {
        Set<String> words=new TreeSet<String>(
                new TextFile("ListFeature.java","\\W+")
        );
        System.out.println(words);
    }
}
