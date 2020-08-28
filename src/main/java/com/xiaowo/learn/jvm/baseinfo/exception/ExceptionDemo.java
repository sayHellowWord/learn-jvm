package com.xiaowo.learn.jvm.baseinfo.exception;

/**
 * Created by wubo15 on 2020/8/27.
 *
 * @author wubo15
 * @date 2020/8/27
 */
public class ExceptionDemo {


    public static void main(String[] args) {
        try {
            mayThrowException();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void mayThrowException() {

    }

}
