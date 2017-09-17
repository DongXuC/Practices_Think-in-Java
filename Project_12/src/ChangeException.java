/**
 * Created by XuChen on 2017/9/17.
 * Description:
 */
class AnException extends Exception{}

class AnotherException extends Exception{}

public class ChangeException {
    static void g() throws AnException {
        throw new AnException();
    }

    static void f() throws AnotherException {
        try {
            g();
        } catch (AnException a) {
            System.out.println("Catch AnException");
            System.out.println(a);
            throw new AnotherException();
        }
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (AnotherException a) {
            System.out.println("Catch anotherException");
            System.out.println(a);
        }
    }
}
