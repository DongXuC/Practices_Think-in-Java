import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by XuChen on 2017/9/28.
 * Description:
 */
public class Group {
    static public final String POEM =
            "Twas brillig, and the slithy toves\n" +
                    "Did gyre and gimble in the wabe.\n" +
                    "All mimsy were the borogoves, \n" +
                    "And the mome raths outgrabe.\n\n" +
                    "Beware the Jabberwock, my son,\n" +
                    "The jaw that bite, the claws that catch.\n" +
                    "Beware the Jubjub bird, and shun\n" +
                    "The frumious Bandersnatch.";

    public static void main(String[] args) {
        Matcher matcher = Pattern.compile("(\\b[a-z][a-zA-Z]+)").matcher(POEM);
        int count = 0;
        while (matcher.find()) {
            for (int i = 0; i < matcher.groupCount(); ++i) {
                System.out.println("[" + matcher.group(i) + "]");
                ++count;
            }
        }
        System.out.println(count);
    }
}
