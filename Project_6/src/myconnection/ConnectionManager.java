package myconnection;
import java.util.Scanner;

/**
 * Created by XuChen on 2017/7/28.
 */
class Connection {
    private int count = 0;

    Connection(int num) {
        count = num;
        System.out.println("connection : " + num);
    }
    public void print(){
        System.out.println("connection "+count+" is connected.");
    }
}
public class ConnectionManager {
    //    public ConnectionManager(){
//        System.out.println("Enter length of the connection.");
//        Scanner scanner=new Scanner(System.in);
//        num=scanner.nextInt();
//     }
    public static Connection[] builtConnection(int num) {
        Connection connection[] = new Connection[num];
        if (num != 0) {
            for (int i = 0; i < num; ++i) {
                connection[i] = new Connection(i);
//                connection[i].print();
            }
            return connection;
        } else {
            return null;
        }
    }
}
