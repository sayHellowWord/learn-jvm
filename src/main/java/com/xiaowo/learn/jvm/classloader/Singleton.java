package com.xiaowo.learn.jvm.classloader;

/**
 * Created by wubo15 on 2020/8/24.
 *
 * @author wubo15
 * @date 2020/8/24
 */
public class Singleton {

    private Singleton() {
    }

    private static class LazyHolder {
        static final Singleton INSTANCE = new Singleton();

        static {
            System.out.println("LazyHolder.");
        }
    }

    public static Object getInstance(boolean flag) {
        if (flag) return new LazyHolder[2];
        return LazyHolder.INSTANCE;
    }

    public static void main(String[] args) {
        getInstance(true);
        System.out.println("----");
        getInstance(false);
    }

}
