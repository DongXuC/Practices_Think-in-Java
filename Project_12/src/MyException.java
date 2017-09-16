/**
 * Created by XuChen on 2017/9/16.
 * Description: 创建自己的异常
 */
public class MyException extends Exception {
    String msg;
    MyException(){}
    MyException(String s){
        this.msg=s;
    }
    void print(){
        System.out.println(msg);
    }

    public static void main(String[] args) {
        try{
            throw new MyException("Hello error!");
        }catch (MyException m){
            m.print();
        }
    }
}
