import net.mindview.util.TextFile;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by XuChen on 2017/9/14.
 * Description: 对每个元素分别计数
 */
public class CountVowelPlus {
    static Map<Character, Integer> vowel = new HashMap<Character, Integer>();

    void search(String fileName) {
        for (String word : new TextFile(fileName, "\\W+")) {
            for (Character c : word.toCharArray()) {
                if (vowel.containsKey(c)) {
                    Integer p = vowel.get(c);
                    vowel.put(c, p == null ? 1 : ++p);
                    /*if (vowel.get(c)==null){      这里没有必要这样判断，因为Integer的值可以为null
                        vowel.put(c,1);
                    }
                    else {
                        int i=vowel.get(c);
                        ++i;
                        vowel.put(c,i);
                }*/
                }
            }
        }

    }

    public static void main(String[] args) {
        vowel.put('a', 0);
        vowel.put('e', 0);
        vowel.put('i', 0);
        vowel.put('o', 0);
        vowel.put('u', 0);
        vowel.put('A', 0);
        vowel.put('E', 0);
        vowel.put('I', 0);
        vowel.put('O', 0);
        vowel.put('U', 0);
        CountVowelPlus test = new CountVowelPlus();
        test.search("src/UniqueWords.java");
        System.out.println(vowel);
    }
}
