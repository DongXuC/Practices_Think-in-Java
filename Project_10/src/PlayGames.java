import java.util.Random;

/**
 * Created by XuChen on 2017/9/5.
 * Description:注意这里的工厂模式是如何使用接口的
 * 工厂模式：首先抽象工厂接口，其中包含了获取产品的方法
 * 在产品中创建匿名内部类，（注意此处创建的方式，静态创建一个工厂接口对象）
 * main中若要获取产品，则调用相应产品内部类对象的get方法
 */

interface Games{
    String next();
}

interface GamesFactory{
    Games getGames();
}

class Coins implements Games {
    private Random random = new Random();
    private String list[] = {"正", "反"};

    @Override
    public String next() {
        return list[random.nextInt(2)];
    }

    public static GamesFactory factory =
            new GamesFactory() {
                @Override
                public Games getGames() {
                    return new Coins();
                }
            };
}

class Dice implements Games {
    private Random random = new Random();
    private String list[] = {"1", "2", "3", "4", "5", "6"};

    @Override
    public String next() {
        return list[random.nextInt(6)];
    }

    public static GamesFactory factory =
            new GamesFactory() {
                @Override
                public Games getGames() {
                    return new Dice();
                }
            };
}

public class PlayGames {
    public static void main(String[] args) {
        Games start1 = Coins.factory.getGames();
        Games start2 = Dice.factory.getGames();
        for (int i = 0; i < 10; ++i) {
            System.out.println(start1.next());
        }
        for (int i = 0; i < 10; ++i) {
            System.out.println(start2.next());
        }
    }

}
