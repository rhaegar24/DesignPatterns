package org.lld.StateMachineDesignPattern.VendingMachine;

public class Product {

    public Integer code;
    public Integer price;
    public ProductNames name;

    public Product(Integer code, Integer price, ProductNames name) {
        this.code = code;
        this.price = price;
        this.name = name;
    }
}
