package org.lld.FactoryDesignPattern;

public class FrontendDeveloper implements Employee {

  @Override
  public Integer getSalary() {
    System.out.println("Inside FrontendDevelopers getSalary");
    return 50000;
  }
}
