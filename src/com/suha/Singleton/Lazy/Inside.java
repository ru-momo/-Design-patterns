package com.suha.Singleton.Lazy;

public class Inside {

    /**
     * 登记式/静态内部类
     * 线程安全
     */
    private static class SingletonHolder {
        private static final Inside INSTANCE = new Inside();
    }
    private Inside (){}
    public static final Inside getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void show(){
        System.out.println("静态内部类");
    }
}
