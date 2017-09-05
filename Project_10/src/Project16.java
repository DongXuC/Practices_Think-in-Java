/**
 * Created by XuChen on 2017/9/5.
 * Description:
 */

interface Cycle{
    void method();
}

interface CycleFactory {
    Cycle getCycle();
}

class Unicycle implements Cycle {
    private Unicycle() {
    }

    @Override
    public void method() {
        System.out.println("Unicycle method()");
    }

    public static CycleFactory factory =
            new CycleFactory() {
                @Override
                public Cycle getCycle() {
                    return new Unicycle();
                }
            };

}

class Bicycle implements Cycle {
    private Bicycle() {
    }

    @Override
    public void method() {
        System.out.println("Bicycle method()");
    }

    public static CycleFactory factory =
            new CycleFactory() {
                @Override
                public Cycle getCycle() {
                    return new Bicycle();
                }
            };
}

public class Project16 {
    void showMethod(CycleFactory c) {
        Cycle cycle = c.getCycle();
        cycle.method();
    }

    public static void main(String[] args) {
        Project16 project16 = new Project16();
        project16.showMethod(Unicycle.factory);
        project16.showMethod(Bicycle.factory);

    }
}
