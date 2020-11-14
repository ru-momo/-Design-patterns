package com.suha.Singleton;

import com.suha.Singleton.Lazy.*;
import com.suha.Singleton.Lazy.Enum;

public class SingletonPatternDemo {

    public static void main(String[] args) {

        //不合法的构造函数
        //编译时错误：构造函数 SingleObject() 是不可见的
//        SingleObject object = new SingleObject();

        //获取唯一可用的对象
        SingleObject object = SingleObject.getInstance();

        //显示消息
        object.showMessage();

        //懒汉式
        Singleton instance = Singleton.getInstance();

        instance.showHelloWorld();

        //饿汉式
        EHan eHan = EHan.getInstance();

        eHan.show();

        //双检锁
        DoubleCheck doubleCheck = DoubleCheck.getInstance();

        doubleCheck.show();

        //静态内部类
        Inside inside = Inside.getInstance();

        inside.show();

        //枚举
        Enum.INSTANCE.whateverMethod();
    }
}
