package 设计模式.抽象工厂设计模式;

/**
 * @program: kaudi
 * @description: 四边形实现形状接口
 * @author: wjz
 * @create: 2020-07-21 09:33
 **/
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("画四边形");
    }
}
