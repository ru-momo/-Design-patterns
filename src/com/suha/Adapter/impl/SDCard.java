package com.suha.Adapter.impl;

import com.suha.Adapter.CardInterface;

//内存卡实体类
public class SDCard implements CardInterface {
    @Override
    public void readFilesFromFlashMemory(String diskType, String fileName) {
        System.out.println("从SD卡放映电影：" + fileName);
    }
}
