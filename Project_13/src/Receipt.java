import java.util.Formatter;

/**
 * Created by XuChen on 2017/9/19.
 * Description: 以表格的形式输出，即控制输出以什么为对其
 */
public class Receipt {
    private double total = 0;
    private Formatter formatter = new Formatter(System.out);

    public void printtitle() {
        formatter.format("%-15s %5s %10s\n", "Item", "Oty", "Price");
        formatter.format("%-15s %5s %10s\n", "----", "---", "-----");
//        %后默认为右对齐，添负号为左对齐；数字代表与下一个输出元素的距离，左右对齐为在这个空间中左右对齐
    }

    public void print(String name, int qty, double price) {
        formatter.format("%-15s %5d %10f\n", name, qty, price);
        total += price;
    }

    public void printTotal() {
        formatter.format("%-15s %5s %10f\n", "tax", " ", total * 0.6);
        formatter.format("%-15s %5s %10s\n", " ", " ", "-----");
        formatter.format("%-15s %5s %10f\n", "Total", " ", total);
    }

    public static void main(String[] args) {
        Receipt receipt = new Receipt();
        receipt.printtitle();
        receipt.print("a", 1, 4.25);
        receipt.print("b", 2, 3.65);
        receipt.printTotal();
    }
}
