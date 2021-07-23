package com.victorbicego.designpattern;

public class Factory {

    public static Product newProduct(ProductList product) {

        switch (product) {
            case CAR -> {
                return new Car();
            }
            case TV -> {
                return new TV();
            }
            case MICROWAVE -> {
                return new Microwave();
            }
            default -> throw new IllegalArgumentException("This factory does not product this type of product.");
        }
    }

}
