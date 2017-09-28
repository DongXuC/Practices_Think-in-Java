import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by XuChen on 2017/9/28.
 * Description:
 * matcher() 方法：整个匹配，只有整个String完全匹配成功，才会返回True；如果匹配成功，那么将移动下次匹配位置
 * find() 方法：部分匹配，从当前位置开始匹配，找到匹配移动下一个位置
 * lookat() 方法：部分匹配，只从第一个字符串进行匹配，无论成功失败都不再继续匹配
 * 注意每次匹配的位置，可用.reset()来重置匹配位置
 */
public class StrartEnd {
    static void examine(String s, String regex) {
        Matcher m = Pattern.compile(regex).matcher(s);
        while (m.find()) {
            System.out.println("find() : " + m.group() + " start = " + m.start() + " , end = " + m.end());
        }
        if (m.lookingAt()) {
            System.out.println("LookAat : start = " + m.start() + " , end = " + m.end());
        }
        if (m.matches()) {
            System.out.println("Matches : start = " + m.start() + " , end = " + m.end());
        }
    }

    public static void main(String[] args) {
        for (String s : Group.POEM.split("\n")) {
            System.out.println("Input : " + s);
            for (String regex : new String[]{"\\w*ere\\w*",
                    "\\w*at", "t\\w+", "T.*?."}) {
                examine(s, regex);
            }
        }
    }
}
