package com.victorbicego.designpattern;

public class FactoryTest {
    public static void main(String[] args) {

        Product product1 = Factory.newProduct(ProductList.CAR);
        product1.doStuff();

        Product product2 = Factory.newProduct(ProductList.TV);
        product2.doStuff();

        Product product3 = Factory.newProduct(ProductList.MICROWAVE);
        product3.doStuff();

        Product product4 = Factory.newProduct(ProductList.COMPUTER);

    }
}
