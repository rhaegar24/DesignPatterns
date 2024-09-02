package org.lld.FactoryDesignPattern;

public class EmployeeFactory {

  public static Employee getEmployee(String type) {
    if (type.equals("Backend Developer")) return new BackendDeveloper();
    else if (type.equals("Frontend Developer")) return new FrontendDeveloper();

    return null;
  }
}
