import java.util.Arrays;
import java.util.List;

/**
 * Created by XuChen on 2017/10/10.
 * Description:注意 instanceof的用法，用以检测某一对象是否是某一类的实例
 */
abstract class Shape{
    void draw(){
        System.out.println(this+".draw()");
    }
    abstract public String toString();
}

class Circle extends Shape{
    @Override
    public String toString() {
        return "Circle";
    }
}

class Square extends Shape{
    @Override
    public String toString() {
        return "Square";
    }
}

class Triangle extends Shape{
    @Override
    public String toString() {
        return "Triangle";
    }
}

public class Shapes {
    static void rotate(Shape shape){
        if (shape instanceof Circle){
            System.out.println("Rotating circle is meaningless!");
        }else {
            System.out.println("Rotating "+shape+"!");
        }
    }
    public static void main(String[] args) {
        try {
            Shape circle = new Circle();
            if (circle instanceof Triangle) {               /*注意此处instanceof的用法*/
                Triangle triangle = (Triangle) circle;
                triangle.draw();
            }
            else {
                System.out.println("circle is not the instance of Triangle");
            }
//            如果对向向上转型后的类进行错误的向下转型，会抛出ClassCastException异常
//            而且未编译时不会报错，这说明未编译时，jvm还没有检查该类的类型

        }catch (ClassCastException e){
            System.out.println(e);
        }

        List<Shape> shapeList= Arrays.asList(new Circle(),new Square(),new Triangle());
        for (Shape s:shapeList){
            s.draw();
            rotate(s);
        }

    }
}
