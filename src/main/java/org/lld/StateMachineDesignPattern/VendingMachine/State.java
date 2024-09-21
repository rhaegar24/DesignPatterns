package org.lld.StateMachineDesignPattern.VendingMachine;

public interface State {
  /**
   * use this interface to keep all the functions of all the states, implement the functions of the
   * appropriate states and throw exceptions in invalid functions
   */
  void chooseProduct(VendingMachine vendingMachine);

  void enterProductCode(VendingMachine vendingMachine, Integer code);

  void insertMoney(VendingMachine vendingMachine, Integer money);

  void disperseProduct(VendingMachine vendingMachine);
}
