/**
 * Created by XuChen on 2017/7/18.
 */
public class StringTest {
    public static void stringCompare(String str_1,String str_2){
        String a=str_1,b=str_2;
        System.out.println("str_+=str_2 : "+(a+=b));
//        System.out.println("str_1 > str_2"+(str_1>str_2));
//        System.out.println(str_1>=str_2);
        System.out.println("str_1 == str_2 : "+(str_1==str_2));
        System.out.println("str_1 == str_2 (.equals()) : "+(str_1.equals(str_2)));
//        System.out.println("str_1 && str_2"+(str_1&&str_2));
    }
}
