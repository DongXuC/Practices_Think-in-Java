package Project_2_11;
import java.util.Scanner;

/**
 * Created by XuChen on 2017/7/17.
 */
public class GetWords {
    public static String[] getWords() {
        String[] words = new String[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three parameter:\n");
        words[0] = scanner.next();
        words[1] = scanner.next();
        words[2] = scanner.next();
        return words;
    }
}
