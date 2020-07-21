package 设计模式.抽象工厂设计模式;

/**
 * @program: kaudi
 * @description: 工厂生成器
 * @author: wjz
 * @create: 2020-07-21 10:52
 **/
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("shape")) {
            return new ShapeFactory();
        }
        if (choice.equalsIgnoreCase("color")) {
            return new ColorFactory();
        }
        return null;
    }
}
