package org.lld.StrategyDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class Flight implements NavigationStrategy {

  @Override
  public Map<String, Object> navigate(int a, int b) {

    System.out.println("inside flight navigate");
    return new HashMap<>();
  }
}
