import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * Created by XuChen on 2017/8/2.
 */
public class TestFinal {
    public final int VALUE_3;
    public static final int VALUE_1 = 1;
    public final int VALUE_2 = 2;
    public TestFinal(){
        VALUE_3=3;
    }
    public TestFinal(int i){
        VALUE_3=i;
    }
    private void f(){
        System.out.println("This is a private method");
    }
    public final void f1(){
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println(VALUE_1);
        TestFinal testFinal = new TestFinal();
        System.out.println(testFinal.VALUE_2);
        System.out.println(testFinal.VALUE_3);

    }
}
class OverridingPrivat extends TestFinal{
    public void f(){        /*由于父类中f()并非接口，所以这里并不会出现@Override注解，即这里不是重写，只是恰好重名*/

    }
}
