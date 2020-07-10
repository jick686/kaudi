package test;

/**
 * @program: kaudi
 * @description: 针对two进行一个改进
 * @author: wjz
 * @create: 2020-07-10 16:11
 **/
public class MyThreadThree extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            if (this.isInterrupted()) {
                System.out.println("已经是停止状态了!");
                return;
            }
            System.out.println("记录i = " + i + 1);
        }
        System.out.println("走到这里线程没有停止");
    }
}
