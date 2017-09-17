/**
 * Created by XuChen on 2017/9/17.
 * Description:
 */
class BaseballException extends Exception{}

class Foul extends BaseballException{}

class Strike extends BaseballException{}

abstract class Inning{
    public Inning() throws BaseballException{}
    public void event() throws BaseballException{}
    public abstract void atBat() throws Strike,Foul;
    public void walk() {}
}
class StormyException extends Exception{}

class RaineOut extends StormyException{}

class PopFoul extends Foul{}

interface Storm{
    public void event() throws RaineOut;
    public void RainHard() throws RaineOut;
}

public class StormyInning  extends Inning implements Storm{
    public StormyInning() throws RaineOut,BaseballException{}
    public StormyInning(String s) throws Foul,BaseballException{}
//    public void walk() throws PopFoul{}       子类无法改变基类抛出异常的类型
//    public void event() throws RaineOut{}       所继承的接口与基类有同名方法，那么抛出异常类型由基类决定
    public void RainHard() throws RaineOut{}
    public void event() {}          /*继承的方法可以不声明所抛出异常的类型，但仍可抛出基类所声明的异常类型*/

    @Override
    public void atBat() throws Foul {}

    public static void main(String[] args) {
        try{
            StormyInning si=new StormyInning();
            si.atBat();
        }catch (Foul f){
            System.out.println("PopFoul");
        }catch (RaineOut r){
            System.out.println("RainOut");
        }catch (BaseballException b){
            System.out.println("BaseballException");
        }

        try{
            Inning inning=new StormyInning();
            inning.atBat();
        }catch (Strike s){
            System.out.println(s);
        }catch (Foul f){
            System.out.println(f);
        }catch (BaseballException b){
            System.out.println(b);
        }catch (RaineOut r){
            System.out.println(r);           /*对象经过向上转型后，必须同时捕获基类和子类所声明的异常*/
            }
    }
}
