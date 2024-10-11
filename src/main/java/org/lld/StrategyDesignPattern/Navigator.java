package org.lld.StrategyDesignPattern;

import java.util.Map;

public class Navigator {

  private NavigationStrategy navigationStrategy;

  public void setNavigationStrategy(String modeOfTransport) {
    this.navigationStrategy = NavigationFactory.getNavigationStrategy(modeOfTransport);
  }

  public Map<String, Object> getRoute(int a, int b) {
    return navigationStrategy.navigate(a, b);
  }
}
