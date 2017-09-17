/**
 * Created by XuChen on 2017/9/17.
 * Description:在finally中第二次抛出异常，会使第一次抛出的异常被忽略掉。、
 * 保证finally中抛出的异常能够在finally中被接收
 */
class VeryImportantException extends Exception{
    @Override
    public String toString() {
        return "A VeryImportantException!";
    }
}

class HoHumException extends Exception {
    @Override
    public String toString() {
        return "A HoHumException!";
    }
}

class ThirdException extends Exception {
    @Override
    public String toString() {
        return "A ThirdException!";
    }
}

public class LostMessage {
    void method1() throws VeryImportantException {
        throw new VeryImportantException();
    }

    void method2() throws HoHumException {
        throw new HoHumException();
    }

    void method3() throws ThirdException {
        throw new ThirdException();
    }

    public static void main(String[] args) {
        try {
            LostMessage msg = new LostMessage();
            try {
                try {
                    msg.method1();
                } finally {
                    msg.method2();
                }
            } finally {
                msg.method3();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        try{
            LostMessage msg=new LostMessage();
            try{
                msg.method1();
            }finally {
                try{
                    msg.method2();
                }catch (HoHumException e){      /*没有接收到的异常会继续向上一层抛出*/
                    System.out.println(e);
                }
            }
        }catch (VeryImportantException v){
            System.out.println(v);
        }
    }
}
