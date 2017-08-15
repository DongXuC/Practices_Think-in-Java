import java.util.Random;

/**
 * Created by XuChen on 2017/8/15.
 */

interface Game {
    String next();
    void reset();
}

interface GameFactory {
    Game getGame();
}

class Coins implements Game {
    private int count=1;
    private String coins[] = {"Obverse", "Reverse"};
    private Random random = new Random();

    @Override
    public String next() {
        System.out.println("time "+count+" : ");
        ++count;
        return coins[random.nextInt(2)];
    }

    @Override
    public void reset() {
        this.count=1;
    }
}

class CoinsFactory implements GameFactory {
    @Override
    public Game getGame() {
        return new Coins();
    }
}

class Dice implements Game {
    private String dice[] = {"1", "2", "3", "4", "5", "6"};
    private int count = 1;
    private Random random = new Random();

    @Override
    public String next() {
        System.out.println("time " + count + " : ");
        ++count;
        return dice[random.nextInt(6)];
    }

    @Override
    public void reset() {
        this.count = 1;
    }
}

class DiceFactory implements GameFactory {
    @Override
    public Game getGame() {
        return new Dice();
    }
}

public class Games {
    //如果不用工厂模式
    public static void playGame1(Game game,int time){
        for (int i=0;i<time;++i){
            System.out.println(game.next());
        }
    }
//    使用工厂模式
    public static void playGame2(GameFactory game,int time){        /*使用工厂模式主要用于解决
                                                                    对于实现了统一接口的不同类有着复杂构造函数的情况
                                                                    使得能够统一解决扩展性和易修改性的问题*/
        Game g=game.getGame();
        for (int i=0;i<time;++i){
            System.out.println(g.next());
        }
    }

    public static void main(String[] args) {
        playGame1(new Coins(),5);
        playGame1(new Dice(),5);
        System.out.println("factory method:");
        playGame2(new CoinsFactory(),5);
        playGame2(new DiceFactory(),5);
    }
}
