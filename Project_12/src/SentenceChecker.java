/**
 * Created by XuChen on 2017/9/21.
 * Description:  这里还不能理解
 */
public class SentenceChecker {
    static boolean check(String s){
        return s.matches("\\p{javaUpperCase}.*\\.");
//        正则表达式解读：\\p{javaUpperCase}识别第一个字母是否大写
//                .*表示0个或多个任意字符串
//                \\.通过\\转义，识别最后一个字符是不是.
    }

    public static void main(String[] args) {
        System.out.println(check("Hello"));
        System.out.println(check("Hello."));
        System.out.println(check("hEllo."));
        System.out.println(check("Hell.o"));
    }
}
