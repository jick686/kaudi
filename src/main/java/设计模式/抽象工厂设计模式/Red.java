package 设计模式.抽象工厂设计模式;

/**
 * @program: kaudi
 * @description: 填充红色
 * @author: wjz
 * @create: 2020-07-21 09:53
 **/
public class Red implements Color{
    @Override
    public void fill() {
        System.out.println("填充红色");
    }
}
