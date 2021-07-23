package com.victorbicego.designpattern;

public class Car implements Product {

    @Override
    public void doStuff() {
        System.out.println("From A to B -> From B to A");
    }
}
