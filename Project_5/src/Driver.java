/**
 * Created by XuChen on 2017/7/24.
 */
/*练习10-12还没做*/
public class Driver {
    public static void main(String[] args) {
        InitialString initialString = new InitialString();
        System.out.println("Practice No.1 and No.2 : ");
        System.out.println(initialString.str_1);
        System.out.println(initialString.str_2);
        System.out.println(initialString.str_3);
        System.out.println("Practice No.3 and No.4 : ");
        OverLoad overLoad = new OverLoad();
        OverLoad overLoad1 = new OverLoad("Overload");
        System.out.println("Practice No.5 and No.6 : ");
        Dog.bark(1);
        Dog.bark("1");
        Dog.bark(1, "1");
        Dog.bark("1", 1);
        System.out.println("Practice No.8 : ");
        TestThis testThis = new TestThis();
        testThis.print();
        System.out.println("Practice No.9 : ");
        ThisInConstructor thisInConstructor = new ThisInConstructor();
        System.out.println("Practice No.13 : ");
        Cups.cup1.f1(99);
        System.out.println("Practice No.14 : ");
        System.out.println("现在并未创建StaticBlock对象,此时两个数据成员的值以被初始化");
        StaticBlock.print();
        System.out.println("Practice No.16 : ");
        ArrayTest arrayTest = new ArrayTest();
        arrayTest.print();
        System.out.println();
        System.out.println("Practice No.17 : ");
        ArrayTest a[] = new ArrayTest[5];         //这里创建的只是对象引用数组，要等实际创建数组时，才完成类类型数组的初始化
        System.out.println("Practice No.18 : ");
        for (int i = 0; i < a.length; ++i) {
            a[i] = new ArrayTest(Integer.toString(i));
        }
        System.out.println("Practice No.19 : ");
        VarArgs.print("Hello", "world!");
        String str2[] = new String[]{"Hello", "world!"};
        VarArgs.print(str2);
        System.out.println("Practice No.21 : ");
        for (Cash cash : Cash.values()) {
            System.out.println(cash + " : " + cash.ordinal());
        }
        System.out.println("Practice No.22 : ");
        TestEnum testEnum = new TestEnum(Cash.MAOYEYE);
        testEnum.print();

    }
}
