package test;

/**
 * @program: kaudi
 * @description: 运行优化之后的测试类
 * @author: wjz
 * @create: 2020-07-10 16:14
 **/
public class RunThree {
    public static void main(String[] args) {
        try {
            MyThreadThree myThreadThree = new MyThreadThree();
            myThreadThree.start();
            Thread.sleep(200);
            myThreadThree.interrupt();
        } catch (InterruptedException e) {
            System.out.println("异常");
            e.printStackTrace();
        }
        System.out.println("end");

    }
}
