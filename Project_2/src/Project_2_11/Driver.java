package Project_2_11;

import Project_2_7.HelloData;
import java.io.*;
import java.util.Arrays;

/**
 * Created by XuChen on 2017/7/17.
 */
public class Driver {
    public static void main(String[] arg) {
        DataInitial practice_1 = new DataInitial();
//        HelloData helloData=new HelloData();  display定义为静态方法，无需创建对象
        DataOnly dataOnly = new DataOnly();
        System.out.println("Practice_2.11.1:");
        practice_1.display();
        System.out.println("Practice_2.11.2:");
        HelloData.display();
        System.out.println("Practice_2.11.4/5:");
        dataOnly.i = 2333;
        dataOnly.d = 2.333;
        dataOnly.b = true;
        dataOnly.display();
        System.out.println("Practice_2.11.6:");
        int num = DataStorage.storage("Hello world!");
        System.out.println(num);
        System.out.println("Practice_2.11.7:");
        System.out.println(StaticTest.i);
        Incrementable.increment();
        System.out.println(StaticTest.i);
        System.out.println("Practice_2.11.8:");
        StaticTest staticTest_1 = new StaticTest();
        StaticTest staticTest_2 = new StaticTest();
        staticTest_1.i = 666;
        staticTest_2.i = 999;
        System.out.println(StaticTest.i);
        System.out.println("Practice_2.11.10:");
        String[] words = new String[3];
        words = GetWords.getWords();
        System.out.println(Arrays.toString(words));     /*java中输出数组的方法*/

    }
}
