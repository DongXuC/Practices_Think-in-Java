/**
 * Created by XuChen on 2017/9/16.
 * Description:
 */
public class TestTryCatch {
    public static void main(String[] args) {
        String s = null;
        try {
            s.toString();
        } catch (Exception e) {
            System.out.println(e);
//            e.printStackTrace();
        }
        Integer i[]=new Integer[10];
        try{
            System.out.println(i[10]);
        }catch (ArrayIndexOutOfBoundsException a){
            System.err.println(a);;
        }
    }
}
