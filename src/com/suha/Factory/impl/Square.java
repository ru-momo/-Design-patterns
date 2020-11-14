package com.suha.Factory.impl;

import com.suha.Factory.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
