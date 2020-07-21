package 设计模式.抽象工厂设计模式;

/**
 * @program: kaudi
 * @description: 填充黄色
 * @author: wjz
 * @create: 2020-07-21 09:57
 **/
public class Yellow implements Color {

    @Override
    public void fill() {
        System.out.println("填充黄色");
    }
}
