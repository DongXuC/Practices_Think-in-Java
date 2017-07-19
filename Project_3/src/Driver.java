import java.util.Date;

/**
 * Created by XuChen on 2017/7/18.
 */
public class Driver {
    public static void main(String[] args) {
        FloatType floatType = new FloatType();
        EverageSpeed everageSpeed = new EverageSpeed();

        System.out.println("Practice 2 : ");        /*别名机制，对象间相互复制视为引用*/
        FloatNum floatNum = new FloatNum();
        floatNum.num = 3;
        System.out.println("1:num.num = " + floatNum.num);
        floatType.Change(floatNum);
        System.out.println("2:num.num = " + floatNum.num);
        System.out.println("Practice 4 : ");        /*计算速度程序*/
        everageSpeed.Speed();
        System.out.println("Practice 5 : ");        /*测试Dog类*/
        Dog dog_1 = new Dog();
        Dog dog_2 = new Dog();
        dog_1.CreateDog("spot", "Ruff!");
        dog_2.CreateDog("scruffy", "Wurf!");
        System.out.println("Dog No.1 :");
        dog_1.DisPlay();
        System.out.println("Dog No.2 :");
        dog_2.DisPlay();
        System.out.println("Practice 6 : ");
        Dog dog_3 = new Dog();
        dog_3 = dog_1;                            /*对象间复制*/
        System.out.println(dog_1 == dog_3);
        Dog dog_4 = new Dog();
        dog_4.CreateDog("spot", "Ruff!");
        System.out.println(dog_1 == dog_4);       /*期望输出为false*/
        System.out.println(dog_1.euqals(dog_4)); /*用对象的equals方法来判别实例的内容是否相等，这里Dog类中重写了equals方法，默认的equals方法比较的是引用*/
        System.out.println("Practice 7 : ");
        for (int i = 0; i < 10; ++i) {
            CallHeadsOrTails.Start();
        }
        System.out.println("Practice 8 : ");
        long num_1 = 0xfff;
        long num_2 = 0777;
        System.out.println("num_1 = " + num_1 + " num_1(b) = " + Long.toBinaryString(num_1));
        System.out.println("num_2 = " + num_2 + " num_2(b) = " + Long.toBinaryString(num_2));
        System.out.println("Practice 9 : ");
        System.out.println("float : " + Float.MAX_VALUE);
        System.out.println("long : " + Double.MAX_VALUE);
        System.out.println("Practice 14 : ");
        StringTest.stringCompare("Hello", "world");
        StringTest.stringCompare("Hello", "Hello");
    }
}
