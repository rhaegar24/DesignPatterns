package org.lld.StateMachineDesignPattern.VendingMachine;

import org.lld.StateMachineDesignPattern.VendingMachine.States.IdleState;

import java.util.HashMap;
import java.util.Map;

class Main {

  public static void main(String[] args) {
    System.out.println("Starting Vending Machine");

    // Initializing the vending machine, adding products through setter
    VendingMachine vendingMachine = new VendingMachine();
    vendingMachine.setProducts(getProductsMap());
    vendingMachine.setState(new IdleState(vendingMachine));

    System.out.println("Choosing product");

    // changing state from idle ste to chose product state
    vendingMachine.getState().chooseProduct(vendingMachine);

    System.out.println("Entering product code");

    // entering product code and changing state from choose product to insert money state
    vendingMachine.getState().enterProductCode(vendingMachine, 101);

    System.out.println("Entering money");

    // checking the inserted amount and changing stet to disperse product state
    vendingMachine.getState().insertMoney(vendingMachine, 100);

    System.out.println("Dispersing Product");

    // dispersing product, updating inventory and changing state back to idle state
    vendingMachine.getState().disperseProduct(vendingMachine);
  }

  private static Map<Integer, Product> getProductsMap() {
    Map<Integer, Product> productMap = new HashMap<>();
    Product product1 = new Product(101, 100, ProductNames.COKE);
    Product product2 = new Product(102, 200, ProductNames.FANTA);
    Product product3 = new Product(103, 300, ProductNames.THUMSUP);

    productMap.put(product1.code, product1);
    productMap.put(product2.code, product2);
    productMap.put(product3.code, product3);

    return productMap;
  }
}
