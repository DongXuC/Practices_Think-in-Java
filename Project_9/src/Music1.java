/**
 * Created by XuChen on 2017/8/12.
 */

abstract class Instrument {
    int VALUE = 5;

    abstract void play(int n);

    abstract void adjust();
}

class Wind extends Instrument{
    @Override
    public void play(int n) {
        System.out.println(this+".playing "+n);
    }

    @Override
    public String toString() {
        return "Wind{}";
    }

    @Override
    public void adjust() {
        System.out.println(this+".adjust ");
    }
}

class Percussion extends Instrument {
    @Override
    public void play(int n) {
        System.out.println(this + ".playing " + n);
    }

    @Override
    public void adjust() {
        System.out.println(this + ".adjust");
    }

    @Override
    public String toString() {
        return "Percussion{}";
    }
}

class Brass extends Wind{
    @Override
    public String toString() {
        return "Brass{}";
    }
}

class WoodWind extends Wind{
    @Override
    public String toString() {
        return "WoodWind{}";
    }
}

public class Music1 {
    public static void tune(Instrument e[]) {
        for (Instrument i : e) {
            i.play(1);
        }
    }

    public static void main(String[] args) {
        Instrument test[] = {
                new Wind(),
                new Percussion(),
                new Brass(),
                new WoodWind()
        };
        tune(test);
    }
}
