package org.lld.StateMachineDesignPattern.VendingMachine.States;

import org.lld.StateMachineDesignPattern.VendingMachine.Product;
import org.lld.StateMachineDesignPattern.VendingMachine.State;
import org.lld.StateMachineDesignPattern.VendingMachine.VendingMachine;

public class DisperseProductState implements State {

  @Override
  public void chooseProduct(VendingMachine vendingMachine) {
    throw new RuntimeException("Not allowed");
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
    Product product = vendingMachine.getProduct();
    Integer productCode = product.code;
    vendingMachine.getProducts().remove(productCode);

    vendingMachine.setState(new IdleState(vendingMachine));
  }
}
