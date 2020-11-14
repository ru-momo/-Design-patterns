package com.suha.Adapter.impl;

import com.suha.Adapter.CardInterface;
import com.suha.Adapter.ComputerInterface;

//适配器类
public class CardAdaptor implements ComputerInterface {
    CardInterface cardInterface;

    @Override
    public void readFilesFromHardDisk(String diskType, String fileName) {
        if ("SDCard".equals(diskType)) {
            cardInterface = new SDCard();
        }
        else {
            cardInterface = new TFCard();
        }
        cardInterface.readFilesFromFlashMemory(diskType, fileName);
    }
}
