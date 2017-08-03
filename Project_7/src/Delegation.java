/**
 * Created by XuChen on 2017/7/31.
 */
public class Delegation {
    Detergent detergent = new Detergent();    /*IDE支持自动生成代理或toString等方法（右键加generator）*/

    public void append(String word) {
        detergent.append(word);
    }

    public void scrub() {
        detergent.scrub();
    }

    @Override
    public String toString() {
        return "Delegation{" +
                "detergent=" + detergent +
                '}';
    }

    public static void main(String[] args) {
        Delegation delegation = new Delegation();
        delegation.scrub();
        System.out.println(delegation);
    }
}
