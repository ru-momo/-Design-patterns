package com.suha.Observer;

public class Client {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        //创建微信用户
        ConcreteObserver user1 = new ConcreteObserver("张三");
        ConcreteObserver user2 = new ConcreteObserver("李四");
        ConcreteObserver user3 = new ConcreteObserver("小明");
        //订阅公众号
        concreteSubject.attach(user1);
        concreteSubject.attach(user2);
        concreteSubject.attach(user3);
        //公众号更新发出信息给订阅的微信用户
        concreteSubject.notify("《我们大师兄脑子有坑》动漫更新了！");
    }
}
