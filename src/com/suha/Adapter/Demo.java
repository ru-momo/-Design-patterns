package com.suha.Adapter;

import com.suha.Adapter.impl.Computer;

public class Demo {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.readFilesFromHardDisk("hardDisk","《哈哈哈哈哈》");
        computer.readFilesFromHardDisk("TFCard","《元龙》");
        computer.readFilesFromHardDisk("SDCard","《名侦探柯南》");
    }
}
