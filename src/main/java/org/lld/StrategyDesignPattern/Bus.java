package org.lld.StrategyDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class Bus implements NavigationStrategy {

  @Override
  public Map<String, Object> navigate(int a, int b) {

    System.out.println("inside bus navigate");
    return new HashMap<>();
  }
}
