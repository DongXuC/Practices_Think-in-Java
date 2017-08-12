/**
 * Created by XuChen on 2017/8/12.
 */

interface Instrument2 {
    void adjust();
}

interface Playable{
    void play(int n);
}

class Wind2 implements Instrument2,Playable{
    @Override
    public void adjust() {
        System.out.println(this+".adjust");
    }

    @Override
    public void play(int n) {
        System.out.println(this+".play "+n);
    }

    @Override
    public String toString() {
        return "Wind2{}";
    }
}

class Percussion2 implements Instrument2,Playable{
    @Override
    public void adjust() {
        System.out.println(this+".adjust");
    }

    @Override
    public void play(int n) {
        System.out.println(this+".play "+n);
    }

    @Override
    public String toString() {
        return "Percussion2{}";
    }
}

class WoodWind2 extends Wind2{
    @Override
    public String toString() {
        return "WoodWind2{}";
    }
}

public class Music2 {
    public static void tune(Playable p){
        p.play(1);
//        p.adjust();       这里参数只接受Playable类型，因此无法调用其他参数的方法
    }
}
