package com.suha.Adapter.impl;

import com.suha.Adapter.ComputerInterface;

//电脑类
public class Computer implements ComputerInterface {
    CardAdaptor cardAdaptor;

    @Override
    public void readFilesFromHardDisk(String diskType, String fileName) {
        if ("hardDisk".equals(diskType)) {
            System.out.println("从硬盘放映电影：" + fileName);
        }
        else if("TFCard".equals(diskType) || "SDCard".equals(diskType)){
            cardAdaptor = new CardAdaptor();
            cardAdaptor.readFilesFromHardDisk(diskType, fileName);
        }
        else {
            System.out.println("参数非法");
        }
    }
}
