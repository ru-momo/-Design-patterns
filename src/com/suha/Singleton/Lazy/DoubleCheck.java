package com.suha.Singleton.Lazy;

public class DoubleCheck {

    /**
     * 双检锁/双重校验锁
     * 线程安全
     */
    private volatile static DoubleCheck instance;
    private DoubleCheck (){}
    public static DoubleCheck getInstance() {
        if (instance == null) {
            synchronized (DoubleCheck.class) {
                if (instance == null) {
                    instance = new DoubleCheck();
                }
            }
        }
        return instance;
    }

    public void show(){
        System.out.println("双检锁");
    }
}
