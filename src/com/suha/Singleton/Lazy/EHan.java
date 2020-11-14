package com.suha.Singleton.Lazy;

public class EHan {

    /**
     *饿汉式
     *线程安全
     */
    private static EHan instance = new EHan();
    private EHan (){}
    public static EHan getInstance() {
        return instance;
    }

    public void show(){
        System.out.println("饿汉式");
    }
}
