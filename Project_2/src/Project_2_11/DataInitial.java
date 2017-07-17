package Project_2_11;

/**
 * Created by XuChen on 2017/7/17.
 */
public class DataInitial {
    int i;
    char j;
    public void display(){      /*这里不能将方法设置为静态，因为调用了类中的数据成员？*/
        System.out.println(i);
        System.out.println(j);
    }
}

