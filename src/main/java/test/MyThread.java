package test;

/**
 * @program: kaudi
 * @description: 测试多线程
 * @author: wjz
 * @create: 2020-07-10 15:14
 **/
public class MyThread extends Thread {
    private int count = 5;

//    public MyThread(String name) {
//        super();
//        this.setName(name);
//    }
    @Override
    public synchronized void run() {
        super.run();
        while (count > 0) {
            count --;
            System.out.println("由 " + MyThread.currentThread().getName() + "计算, count= " + count);
        }
    }
}
