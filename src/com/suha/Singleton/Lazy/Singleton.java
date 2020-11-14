package com.suha.Singleton.Lazy;

public class Singleton {

    /**
     * 懒汉式
     * 线程不安全
     */
    private static Singleton instance;
    private Singleton (){}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showHelloWorld(){
        System.out.println("懒汉式");
    }
}
