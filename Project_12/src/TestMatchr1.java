import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by XuChen on 2017/9/22.
 * Description:
 */
public class TestMatchr1 {
    public static void main(String[] args) {
        List<Pattern> list = new ArrayList<Pattern>() {
        };
        list.add(Pattern.compile("^Java"));
        list.add(Pattern.compile("\\Breg.*"));
        list.add(Pattern.compile("n.w\\s+h(a|i)s"));
        list.add(Pattern.compile("s?"));
        list.add(Pattern.compile("s*"));
        list.add(Pattern.compile("s+"));
        list.add(Pattern.compile("s{4}"));
        list.add(Pattern.compile("s{1}."));
        list.add(Pattern.compile("s{0,3}"));
        final String WORDS = "Java now has regular expressions";
            for (Pattern p : list) {
                Matcher m = p.matcher(WORDS);
                while (m.find()) {
//                    System.out.println("Match \"" + m.group() + " at positions " + m.start() + " - " + m.end());
                }
            }
        Pattern pattern=Pattern.compile("((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b");
        Matcher m1=pattern.matcher("Arline ate eight apples and one orange while Anita hadn't any");
        System.out.println("Match \"" + m1.group() + " at positions " + m1.start() + " - " + m1.end());
    }
    }

