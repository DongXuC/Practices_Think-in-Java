import java.util.Arrays;

/**
 * Created by XuChen on 2017/7/19.
 */
public class TestMain {
    public static void main(String[] args) {
        System.out.println("Practice 1 : ");
        ForTest.print();
        System.out.println("Practice 2 : ");
        CompareRandom.Compare();
        System.out.println("Practice 3 : ");
//        CompareRandom.Compare_infinite();
        System.out.println("Practice 4 : ");
        PrimeNumber.generator(100);
        System.out.println("Practice 6 : ");
        System.out.println(IfElse.test(5, 6, 0, 10));
        System.out.println("Practice 7 : ");
        ForTest_2.testBreak();
        System.out.println(ForTest_2.testReturn());
        System.out.println("Practice 9 : ");
        Fibonacci.generator(9);
        System.out.println();
        System.out.println("Practice 10 : ");
        VampireNumber.generator();
    }
}
