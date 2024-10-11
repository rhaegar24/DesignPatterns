package org.lld.StrategyDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class Car implements NavigationStrategy {

  @Override
  public Map<String, Object> navigate(int a, int b) {

    System.out.println("inside car navigate");
    return new HashMap<>();
  }
}
