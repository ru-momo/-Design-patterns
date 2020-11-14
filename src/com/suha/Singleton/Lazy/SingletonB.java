package com.suha.Singleton.Lazy;

public class SingletonB {

    /**
     * 懒汉式
     * 多线程安全
     */
    private static SingletonB instance;
    private SingletonB(){}
    public static synchronized SingletonB getInstance() {
        if (instance == null) {
            instance = new SingletonB();
        }
        return instance;
    }
}
