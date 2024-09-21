package org.lld.StateMachineDesignPattern.VendingMachine;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {

  State state;

  Product product;

  Map<Integer, Product> products;

    public State getState() {
    return state;
  }

  public void setState(State state) {
    this.state = state;
  }

  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  public Map<Integer, Product> getProducts() {
    return products;
  }

  public void setProducts(Map<Integer, Product> productMap) {
    this.products = productMap;
  }
}
