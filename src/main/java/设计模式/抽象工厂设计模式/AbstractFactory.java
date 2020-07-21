package 设计模式.抽象工厂设计模式;

/**
 * @program: kaudi
 * @description: 抽象工厂类
 * @author: wjz
 * @create: 2020-07-21 09:58
 **/
public abstract class AbstractFactory {
    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);
}
