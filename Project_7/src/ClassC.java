/**
 * Created by XuChen on 2017/7/29.
 */
class ClassA{
//    ClassA(){
//        System.out.println("ClassA");
//    }
    ClassA(int i){
        System.out.println("ClassA"+i);
    }
}
class ClassB{
    ClassB(){
        System.out.println("ClassB");
    }
    ClassB(int i){
        System.out.println("ClassB"+i);
    }
}
public class ClassC extends ClassA{

    ClassC(){
        super(1);
        ClassB classB=new ClassB();
    }
    public static void main(String[] args) {
        ClassC c=new ClassC();      /*先调用ClassA构造器，创建导出类ClassC，ClassC类中又创建了类ClassB*/
    }
}
