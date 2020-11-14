package com.suha.Singleton.Lazy;

public enum  Enum {

    /**
     * 枚举
     * 线程安全
     */
    INSTANCE;
    public void whateverMethod() {
        System.out.println("enum枚举");
    }
}
