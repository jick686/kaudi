package 设计模式.工厂设计模式;

/**
 * @program: kaudi
 * @description: 测试类
 * @author: wjz
 * @create: 2020-07-21 09:47
 **/
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape("circle");
        circle.draw();
        shapeFactory.getShape("rectangle").draw();
        shapeFactory.getShape("square").draw();
    }
}
