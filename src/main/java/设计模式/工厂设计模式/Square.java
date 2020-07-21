package 设计模式.工厂设计模式;

/**
 * @program: kaudi
 * @description: 正方形实现形状接口
 * @author: wjz
 * @create: 2020-07-21 09:32
 **/
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("画正方形");
    }
}
