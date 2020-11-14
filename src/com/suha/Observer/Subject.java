package com.suha.Observer;

public interface Subject {
    /**
     * 添加订阅者
     * @param observer
     */
    void attach(Observer observer);

    /**
     * 删除订阅者
     * @param observer
     */
    void detach(Observer observer);

    /**
     * 通知订阅者更新信息
     * @param message
     */
    void notify(String message);
}
