package test;

/**
 * @program: kaudi
 * @description: 运行类
 * @author: wjz
 * @create: 2020-07-10 15:16
 **/
public class Run {
    public static void main(String[] args) {
        test4();
    }

    public static void test1() {
//        MyThread myThread = new MyThread();
//        myThread.start();
        System.out.println("运行结束");
    }

    public static void test2() {
        MyRunable runable = new MyRunable();
        Thread thread = new Thread(runable);
        thread.start();
        System.out.println("启动结束");
    }

    public static void test3() {
//        MyThread myThread1 = new MyThread("a");
//        MyThread myThread2 = new MyThread("b");
//        MyThread myThread3 = new MyThread("c");
//        myThread1.start();
//        myThread2.start();
//        myThread3.start();
    }

    public static void test4() {
        MyThread myThread = new MyThread();
        Thread a = new Thread(myThread, "a");
        Thread b = new Thread(myThread, "b");
        Thread c = new Thread(myThread, "c");
        Thread d = new Thread(myThread, "d");
        a.start();
        b.start();
        c.start();
        d.start();

    }


}
