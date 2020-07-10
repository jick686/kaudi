package test;

/**
 * @program: kaudi
 * @description: 运行类测试
 * @author: wjz
 * @create: 2020-07-10 16:04
 **/
public class RunTwo {
    public static void main(String[] args) {
        try {
            MyThreadTwo myThreadTwo = new MyThreadTwo();
            myThreadTwo.start();
            //线程休眠2秒
            Thread.sleep(2000);
            //停止线程
            myThreadTwo.interrupt();
        } catch (InterruptedException e) {
            System.out.println("这种写法有问题  线程并不会停止运行");
            e.printStackTrace();
        }
    }
}
