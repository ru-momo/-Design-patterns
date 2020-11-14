package com.suha.Observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject{
    //存储订阅公众号的微信用户
    private List<Observer> WeChatUserList = new ArrayList<>();
    @Override
    public void attach(Observer observer) {
        WeChatUserList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        WeChatUserList.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer : WeChatUserList) {
            observer.update(message);
        }
    }
}
