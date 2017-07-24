/**
 * Created by XuChen on 2017/7/24.
 */
public class TestThis {
    int i = 0;

    void add() {
        i++;
    }

    void print() {
        add();
        this.add();
        System.out.println(i + " i should be 2.");
    }
}
