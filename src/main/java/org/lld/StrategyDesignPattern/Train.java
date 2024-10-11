package org.lld.StrategyDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class Train implements NavigationStrategy {

  @Override
  public Map<String, Object> navigate(int a, int b) {

    System.out.println("inside train navigate");
    return new HashMap<>();
  }
}
