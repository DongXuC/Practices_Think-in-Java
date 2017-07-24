/**
 * Created by XuChen on 2017/7/24.
 */
public class ArrayTest {
    String str[]={"H","e","l","l","o"};
    ArrayTest(){}
    ArrayTest(String s){
        System.out.println(s);
    }
    void print(){
        for(int i=0;i<str.length;i++){
            System.out.print(str[i]);
        }
    }
}
