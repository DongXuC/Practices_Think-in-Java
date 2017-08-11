import java.util.Random;

/**
 * Created by XuChen on 2017/8/11.
 */


class Instrument {
    void play() {
        System.out.println("Instrument.play()");
    }

    @Override
    public String toString() {
        return "Instrument{}";
    }
}

class Wind extends Instrument{
    void play(){
        System.out.println("Wind.play()");
    }

    @Override
    public String toString() {
        return "Wind{}";
    }
}

class Brass extends Instrument {
    void play() {
        System.out.println("Brass.play()");
    }

    @Override
    public String toString() {
        return "Brass{}";
    }
}

class Woodwind extends Instrument {
    void play() {
        System.out.println("Woodwind.play()");
    }

    @Override
    public String toString() {
        return "Woodwind{}";
    }
}

public class Music {
    public static void tune(Instrument i[]) {
        for (Instrument e : i) {
            System.out.println(e);
            e.play();
        }
    }

    public static Instrument randominstrument() {
        Random random = new Random();
        int i = random.nextInt(3);
        switch (i) {
            default:
            case 0:
                return new Wind();
            case 1:
                return new Brass();
            case 2:
                return new Woodwind();
        }
    }

    public static void main(String[] args) {

        for (int i = 0; i < 3; ++i) {
            Instrument instrument = randominstrument();
            System.out.println(instrument);
            instrument.play();
        }
    }

}
