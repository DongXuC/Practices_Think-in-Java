/**
 * Created by XuChen on 2017/7/19.
 */
import java.util.*;
public class VampireNumber {
    public static int[] getNumber(int num, int length) {      /*取出数字转换成数组*/
        double[] buf = new double[length];
        int[] result = new int[length];
        for (int i = 0; i < length; ++i) {
            buf[i] = Math.pow(10, i);
//            System.out.println(buf[i]);
        }
        for (int i = 0, j = (length - 1); i < length; ++i, --j) {
            result[i] = (int) (num / (int) buf[j]);
            num = num % (int) buf[j];
//            System.out.println(result[i]);
        }
        return result;
    }

    public static int[] join(int[] num_1, int[] num_2) {        /*将两个数组合并为一个*/
        int[] result = new int[num_1.length + num_2.length];
        for (int i = 0; i < num_1.length; ++i) {
            result[i] = num_1[i];
        }
        for (int i = 0; i < num_2.length; ++i) {
            result[i + num_1.length] = num_2[i];
        }
        return result;
    }

    public static void generator() {
        for (int i = 10; i < 100; ++i) {
            for (int j = 10; j < 100; ++j) {
                if ((i * j) < 10000) {
//                    int i=21,j=60;
                    int buf = i * j;
                    int[] buf_list = getNumber(buf, 4);
                    Arrays.sort(buf_list);
                    /*for (int test:buf_list){
                        System.out.print(test);
                    }
                    System.out.println();*/
                    int[] nums_list = join(getNumber(i, 2), getNumber(j, 2));
                    Arrays.sort(nums_list);
                    /*for (int test:nums_list){
                        System.out.print(test);
                    }
                    System.out.println();*/
                    if (Arrays.equals(nums_list,buf_list)) {
                        System.out.println(buf + " = " + i + " * " + j);
                    }
                }
            }
        }
    }
}
