import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * Created by XuChen on 2017/7/29.
 */
public class Root {
    Root(){
        System.out.println("Root");
    }
    Component1 c1=new Component1();
    Component2 c2=new Component2();
    Component3 c3=new Component3();
    public void dispose(){
        c1.dispose();
        c2.dispose();
        c3.dispose();
        System.out.println("dispose Root");
    }
}
class Component1{
    Component1(){
        System.out.println("Component1");
    }
    public void dispose(){
        System.out.println("dispose component1");
    }
}
class Component2{
    Component2(){
        System.out.println("Component2");
    }
    public void dispose(){
        System.out.println("dispose component2");
    }
}
class Component3{
    Component3(){
        System.out.println("Component3");
    }
    public void dispose(){
        System.out.println("dispose component3");
    }
}
class Steme extends Root{
    Steme(){
        System.out.println("Steme");
    }
    public void dispose(){
        System.out.println("dispose Steme");
        super.dispose();
    }
    public static void main(String[] args) {
        Steme steme=new Steme();
        try {
        }finally {
            steme.dispose();
        }

    }
}
