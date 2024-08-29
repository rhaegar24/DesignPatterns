package org.lld.FactoryDesignPattern;

public class BackendDeveloper implements Employee {

  @Override
  public Integer getSalary() {
    System.out.println("Inside BackendDevelopers getSalary");
    return 100000;
  }
}
