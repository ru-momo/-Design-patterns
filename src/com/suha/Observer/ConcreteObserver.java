package com.suha.Observer;

public class ConcreteObserver implements Observer{
    //微信用户是观察者，微信用户名
    private String name;
    public ConcreteObserver(String name){
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "-" + message);
    }
}
