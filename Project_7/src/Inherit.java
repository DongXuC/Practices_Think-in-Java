/**
 * Created by XuChen on 2017/7/29.
 */
public class Inherit extends Detergent {
    @Override
    public void scrub() {
        System.out.println("Inherit : ");
        super.scrub();
    }
    public String toString(){
        return "str"+str;
    }

    public static void main(String[] args) {
        Inherit inherit=new Inherit();
        inherit.scrub();
        System.out.println(inherit);
    }
}
