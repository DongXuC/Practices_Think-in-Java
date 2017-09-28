/**
 * Created by XuChen on 2017/9/28.
 * Description:
 * String.split()的返回值为null或数组，数组无法直接sout
 */
public class SplitDemo {
    public static void main(String[] args) {
        String input=
                "This!!unusual use!!of exclamation!!points";
//        System.out.println(input.split("!!"));        返回值为数组
        for (String s:input.split("!!")){
            System.out.println(s);
        }
    }
}
