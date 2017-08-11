/**
 * Created by XuChen on 2017/8/3.
 */
//Practice No.1
public class Cycle {
    public void print() {
        System.out.println("Cycle");
    }

}
class Unicycle extends Cycle{
    public void print(){
        System.out.println("Unicycle");
        super.print();
    }
    void balance(){
        System.out.println("Unicycle.balance()");
    }
}
class Bicycle extends Cycle{
    public void print(){
        System.out.println("Bicycle");
        super.print();
    }
    void balance(){
        System.out.println("Bicycle.balance()");
    }
}
class Tricycle extends Cycle{
    public void print(){
        System.out.println("Tricycle");
        super.print();
    }
}
class Test {
    public void ride(Cycle cycle) {
        System.out.println("Ride");
        cycle.print();
    }

    public static void main(String[] args) {
        Cycle cycle = new Cycle();
        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();
        Test test = new Test();
        test.ride(cycle);
        test.ride(unicycle);
        test.ride(bicycle);
        test.ride(tricycle);
        Cycle cycle1s[]={
                new Unicycle(),
                new Bicycle(),
                new Tricycle()
        };
//        cycle1s[0].balance();                 由于创建cycle1s[]时都向上转型为Cycle类，因此无法调用balance方法
        ((Unicycle)cycle1s[0]).balance();       /*向下转型才能调用balance()方法*/
    }
}

