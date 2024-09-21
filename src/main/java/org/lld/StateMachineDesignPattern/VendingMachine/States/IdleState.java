package org.lld.StateMachineDesignPattern.VendingMachine.States;

import org.lld.StateMachineDesignPattern.VendingMachine.Product;
import org.lld.StateMachineDesignPattern.VendingMachine.State;
import org.lld.StateMachineDesignPattern.VendingMachine.VendingMachine;

public class IdleState implements State {

  public IdleState(VendingMachine vendingMachine) {
    displayProducts(vendingMachine);
  }

  @Override
  public void chooseProduct(VendingMachine vendingMachine) {
    // switch from idle state to chooseProduct state
    vendingMachine.setState(new ChooseProductState());
  }

  @Override
  public void enterProductCode(VendingMachine vendingMachine, Integer code) {
    throw new RuntimeException("Not allowed");
  }

  @Override
  public void insertMoney(VendingMachine vendingMachine, Integer money) {
    throw new RuntimeException("Not allowed");
  }

  @Override
  public void disperseProduct(VendingMachine vendingMachine) {
    throw new RuntimeException("Not allowed");
  }

  private void displayProducts(VendingMachine vendingMachine) {
    System.out.println("------Inventory-----");

    for (Product product : vendingMachine.getProducts().values()) {
      System.out.println(product.code + " " + product.price + " " + product.name);
    }

    System.out.println("--------------------");
  }
}
