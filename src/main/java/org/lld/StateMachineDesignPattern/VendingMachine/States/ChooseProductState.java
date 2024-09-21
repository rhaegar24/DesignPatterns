package org.lld.StateMachineDesignPattern.VendingMachine.States;

import org.lld.StateMachineDesignPattern.VendingMachine.State;
import org.lld.StateMachineDesignPattern.VendingMachine.VendingMachine;

public class ChooseProductState implements State {

  @Override
  public void chooseProduct(VendingMachine vendingMachine) {
    throw new RuntimeException("no allowed");
  }

  @Override
  public void enterProductCode(VendingMachine vendingMachine, Integer code) {
    if (!vendingMachine.getProducts().containsKey(code)) {
      vendingMachine.setState(new IdleState(vendingMachine));
      throw new RuntimeException("Invalid product code entered");
    }

    vendingMachine.setProduct(vendingMachine.getProducts().get(code));
    vendingMachine.setState(new InsertMoneyState());
  }

  public void insertMoney(VendingMachine vendingMachine, Integer money) {
    throw new RuntimeException("Not allowed");
  }

  @Override
  public void disperseProduct(VendingMachine vendingMachine) {
    throw new RuntimeException("Not allowed");
  }
}
