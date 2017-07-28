import access.Widget;
import debug.*;
//import debugoff.*;
import myconnection.ConnectionManager;
import rootclass.FatherClass;
import testpackage.TestClass;

/**
 * Created by XuChen on 2017/7/27.
 */
public class Driver {
    public static void main(String[] args) {
        System.out.println("Practice No.1 : ");
        TestClass.print();
        System.out.println("Practice No.3 : ");
        Test.debug("hello world");
//        Test.debug();         不予许import两个名称相同的方法
        System.out.println("Practice No.4 : ");
//        FatherClass.print();      对不同包的protected方法没有使用权限
        ChildClass.display();
        /*Driver类并非继承于FatherClass，仍无权调用print，但ChildClass类继承于FatherClass，因此可以使用print方法*/
        System.out.println("Practice No.7 : ");
        Widget widget = new Widget();
        System.out.println("Practice No.8 : ");
        Object connections[] = ConnectionManager.builtConnection(10);
        System.out.println(connections.getClass().getName());

//        for (int i=0;i<connections.length;++i){       这里即使创建了Connection对象，但仍无法使用Connection对象的方法
//              connections[i].print;
//        }
    }
}
