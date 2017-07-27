/**
 * Created by XuChen on 2017/7/27.
 */
public class TestEnum {
    Cash cash;

    TestEnum(Cash cash) {
        this.cash = cash;
    }

    public void print() {
        System.out.println("This cash is ");
        switch (cash) {
            case ONE:
                System.out.println("...");
                break;
            case FIVE:
                System.out.println("um...");
                break;
            case TEN:
                System.out.println("hi");
                break;
            case TWENTY:
                System.out.println("hello");
                break;
            case FIVETY:
                System.out.println("How are you!");
                break;
            case MAOYEYE:
                System.out.println("wow!");
                break;
            default:
                System.out.println("???");
        }
    }
}
