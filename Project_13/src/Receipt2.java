import java.util.Formatter;

/**
 * Created by XuChen on 2017/9/19.
 * Description: format方法中用参数来表示间隔
 *%后参数次序为：1.正负号来表示对齐方式；2.最小长度；3.显示数据的类型
 * 这个参数只能是常量
 */
public class Receipt2 {
    private double total;
    private Formatter f = new Formatter(System.out);
    private int ITEM_WIDTH = 15;
    private int QTY = 5;
    private int PRICE = 10;

    public void printtitle() {
//        逗号与加号可以混合使用
        f.format("%-" + ITEM_WIDTH + "s %" + QTY + "s %" + PRICE + "s\n", "Item", "Qty", "Price");
        f.format("%-" + ITEM_WIDTH + "s %" + QTY + "s %" + PRICE + "s\n", "----", "---", "-----");
    }

    public void print(String name, int qty, double price) {
        f.format("%-" + ITEM_WIDTH + "s %" + QTY + "d %" + PRICE + "f\n", name, qty, price);
        total += price;
    }

    public void printTotal() {
        f.format("%-" + ITEM_WIDTH + "s %" + QTY + "s %" + PRICE + "f\n", "Tax", " ", total * 0.6);
        f.format("%-" + ITEM_WIDTH + "s %" + QTY + "s %" + PRICE + "s\n", " ", " ", "-----");
        f.format("%-" + ITEM_WIDTH + "s %" + QTY + "s %" + PRICE + "f\n", "Total", " ", total);
    }

    public static void main(String[] args) {
        Receipt2 test = new Receipt2();
        test.printtitle();
        test.print("Tom", 1, 1.1);
        test.print("Jerry", 2, 2.2);
        test.printTotal();
    }
}
