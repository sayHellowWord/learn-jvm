package com.xiaowo.learn.jvm.baseinfo.exception;

/**
 * Created by wubo15 on 2020/8/27.
 *
 * @author wubo15
 * @date 2020/8/27
 */
public class Foo {
    private int tryBlock;
    private int catchBlock;
    private int finallyBlock;
    private int methodExit;

    public void test() {
        try {
            tryBlock = 0;
        } catch (Exception e) {
            catchBlock = 1;
        } finally {
            finallyBlock = 2;
        }
        methodExit = 3;
    }

}
