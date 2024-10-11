package org.lld.StrategyDesignPattern;

public class NavigationFactory {

  public static NavigationStrategy getNavigationStrategy(String modeOfTransport) {
    switch (modeOfTransport) {
      case "Bus":
        return new Bus();
      case "Car":
        return new Car();
      case "Train":
        return new Train();
      case "Flight":
        return new Flight();
    }
    return null;
  }
}
