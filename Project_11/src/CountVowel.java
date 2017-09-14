import net.mindview.util.TextFile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by XuChen on 2017/9/14.
 * Description: 读取文件内容，并计算元音字母个数
 */
public class CountVowel {
    private static final Set<Character> vowel = new HashSet<Character>(
            Arrays.asList('a', 'e', 'o', 'u', 'i', 'A', 'E', 'O', 'U', 'I'));

    int count(String fileName) {
        int count = 0;
        for (String word : new TextFile(fileName, "\\W+")) {    /*取出文件内容中每个单词*/
//            System.out.println(word);
            for (char c1 : word.toCharArray()) {           /*将String转化为Char数组*/
                if (vowel.contains(c1)) {
                    ++count;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        CountVowel test = new CountVowel();
        int count = test.count("UniqueWords.java");     /*注意字符用单引号*/
        System.out.println(count);
    }
}
