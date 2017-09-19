import java.util.Formatter;

/**
 * Created by XuChen on 2017/9/19.
 * Description:
 * Formatter类：Formatter类会将.format方法所接收到的数据发送到Formatter构造函数所指定的目的地
 * 注: .format()方法所接受的参数同C语言中printf一样，可以格式化输出
 * 如：f.format("%s The Turtle is at (%d, %d)", name, x, y)
 */
public class Turtle {
    private String name;
    private Formatter f;

    public Turtle(String name, Formatter f) {
        this.name = name;
        this.f = f;
    }

    public void move(int x, int y) {
        f.format("%s The Turtle is at (%d, %d)", name, x, y);
    }

    public static void main(String[] args) {
        Turtle turtle = new Turtle("Tommy", new Formatter(System.err));
        turtle.move(1, 2);
    }
}
