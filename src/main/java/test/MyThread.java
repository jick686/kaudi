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
            //返回对当前正在执行的线程对象的引用
            Thread thread = Thread.currentThread();
            System.out.println("当前线程的引用: " + thread.getName());

            //返回此线程的标识符
            long id = thread.getId();
            System.out.println("标识符: " + id);

            //返回此线程的名称
            String name = thread.getName();
            System.out.println("名称: " + name);

            //返回此线程的优先级
            int priority = thread.getPriority();
            System.out.println("优先级: " + priority);

            //返回此线程是否处于活动状态
            boolean alive = thread.isAlive();
            System.out.println("活动状态 " + alive);

            //将当前线程设置为守护线程
            thread.setDaemon(true);

            count --;
            System.out.println("由 " + MyThread.currentThread().getName() + "计算, count= " + count);
        }
    }
}
