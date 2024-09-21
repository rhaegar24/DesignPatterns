package org.lld.StateMachineDesignPattern.VendingMachine.States;

import org.lld.StateMachineDesignPattern.VendingMachine.State;
import org.lld.StateMachineDesignPattern.VendingMachine.VendingMachine;

import java.util.Objects;

public class InsertMoneyState implements State {

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
    if (!Objects.equals(vendingMachine.getProduct().price, money)) {
      refundMoney(money);
      throw new RuntimeException("Enter exact amount");
    }

    vendingMachine.setState(new DisperseProductState());
  }

  private void refundMoney(Integer money) {
    // refund amount logic
  }

  @Override
  public void disperseProduct(VendingMachine vendingMachine) {
    throw new RuntimeException("Not allowed");
  }
}
