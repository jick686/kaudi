package 设计模式.抽象工厂设计模式;

/**
 * @program: kaudi
 * @description: 测试
 * @author: wjz
 * @create: 2020-07-21 10:56
 **/
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory shape = FactoryProducer.getFactory("shape");
        Shape circle = shape.getShape("circle");
        circle.draw();

        Shape rectangle = shape.getShape("RECTANGLE");
        rectangle.draw();

        Shape square = shape.getShape("square");
        square.draw();

        AbstractFactory color = FactoryProducer.getFactory("color");
        Color red = color.getColor("red");
        red.fill();

        color.getColor("yellow").fill();

        color.getColor("green").fill();
    }
}
