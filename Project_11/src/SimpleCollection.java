import java.util.Collection;
import java.util.HashSet;

/**
 * Created by XuChen on 2017/9/9.
 * Description:
 */
public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> c=new HashSet<Integer>();
        for (int i=0;i<10;i++){
            c.add(i);
        }
        for (Integer i:c){
            System.out.println(i);
        }
    }
}
