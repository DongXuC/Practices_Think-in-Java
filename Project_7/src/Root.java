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

}
class Component1{
    Component1(){
        System.out.println("Component1");
    }
}
class Component2{
    Component2(){
        System.out.println("Component2");
    }
}
class Component3{
    Component3(){
        System.out.println("Component3");
    }
}
class Steme extends Root{
    Steme(){
        System.out.println("Steme");
    }
    public static void main(String[] args) {
        Steme steme=new Steme();
    }
}
