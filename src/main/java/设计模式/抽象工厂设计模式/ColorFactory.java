package 设计模式.抽象工厂设计模式;

/**
 * @program: kaudi
 * @description: 颜色工厂
 * @author: wjz
 * @create: 2020-07-21 10:45
 **/
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Gree();
        } else if(color.equalsIgnoreCase("yellow")){
            return new Yellow();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
