/**
 * Created by XuChen on 2017/9/7.
 * Description: 这样写会报空指针异常，尝试用if语句判断指针是否为空后，在进行输出
 */

interface U{
    void method1();
    void method2();
    void method3();
}

class A {
    U getU() {
        return new U() {
            @Override
            public void method1() {
                System.out.println("A.method1");
            }

            @Override
            public void method2() {
                System.out.println("A.method2");
            }

            @Override
            public void method3() {
                System.out.println("A.method3");
            }
        };
    }
}

class B {
    public U u[]=new U[3];
    private int index = 0;

    void setUArray(U u) {
        this.u[index]= u;
        ++index;
    }

    void resetUArray() {
        this.u = null;
    }

    void traversal() {
        for (int i = 0; i < u.length; ++i) {
            u[i].method1();
            u[i].method2();
            u[i].method3();
        }
    }
}

public class Project23 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        for (int i = 0; i < 3; ++i) {
            b.setUArray(a.getU());
        }
        b.traversal();
        b.resetUArray();
        System.out.println("Uarray has already reset.");
        b.traversal();
    }
}
