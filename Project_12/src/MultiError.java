/**
 * Created by XuChen on 2017/9/16.
 * Description:
 */
class Error1 extends IndexOutOfBoundsException{} //这里调用默认构造函数

class Error2 extends NullPointerException{}

class Error3 extends ClassNotFoundException{}

public class MultiError {
    void getErrors() throws Error1,Error2,Error3{
        throw new Error1();
//        throw new Error2();     这里无法这么抛出异常，会说UnreachableStatement，因为第一个异常抛出，
//                                不会再向下运行这个方法，需要在条件语句中抛出第二个异常
//        throw new Error3();
    }

    public static void main(String[] args) {
        try{
            MultiError test=new MultiError();
//            test.getErrors();
            throw new NullPointerException();
        }catch (Error2 e){          /*此时接不住Error2异常，因此如果后面没有catch，程序会报错*/
            System.out.println(e);
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("This finally");
        }
//        catch (Error1 e){           这里由于Error1继承于Exception，在重复catch会报错
//        }
    }
}
