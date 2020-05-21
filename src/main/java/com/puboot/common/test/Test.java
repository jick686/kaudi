package com.puboot.common.test;

import cn.hutool.core.lang.Singleton;

public class Test {
    public static void main(String[] args) {
//        System.out.println(Singleton.getInstance().hashCode());
//        System.out.println(Singleton.getInstance().hashCode());

//        //多线程下
//        for (int i = 0; i < 10; i++) {
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    Singleton3.getInstance3();
//                }
//            }).start();
//        }

        //多线程下
        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Singleton4.getInstance4();
                    Singleton4.getInstance4();
                }
            }).start();

        }
    }
}

class Singleton1 {
    Singleton1() {
    }
}

/**
 * 饿汉式 多线程是安全的   但是不管用没用到都会加载
 */
class Singleton2 {
    private static final Singleton2 singleton = new Singleton2();

    //私有无参构造方法
    private Singleton2() {
    }

    public static Singleton2 getSingleton() {
        return singleton;
    }
}

/**
 * 懒汉式  在多线程下是有问题的[不同步]
 */
//class Singleton {
//    /**
//     * 私有无参构造方法
//     */
//    private Singleton() {
//    }
//
//    /**
//     * 判断是否实例化   如果没有就null一个
//     */
//    private static Singleton instance;
//
//    public static Singleton getInstance() {
//        if (instance == null) {
//            instance = new Singleton();
//        }
//        return instance;
//    }
//}

class Singleton3 {
    private Singleton3() {
        System.out.println(Thread.currentThread().getName());
    }

    private static Singleton3 instance;

    public static Singleton3 getInstance3() {
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }

}

class Singleton4 {
    private Singleton4() {
        System.out.println(Thread.currentThread().getName());
    }

    private volatile static Singleton4 instance;

    public static Singleton4 getInstance4() {
        if (instance == null) {
            synchronized (Singleton4.class) {
                if (instance == null) {
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
}
