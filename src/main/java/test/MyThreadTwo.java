package test;

/**
 * @program: kaudi
 * @description: 测试inteerupt()方法停止线程
 * @author: wjz
 * @create: 2020-07-10 16:02
 **/
public class MyThreadTwo extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + (i + 1));
        }
    }
}
