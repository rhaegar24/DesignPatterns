package org.lld.StrategyDesignPattern;

public class Main {

  public static void main(String[] args) {

    /*
      Whenever you have a class which does a specific thing in multiple ways, it's better to break those ways
      into separate classes with that function to make the main class loosely coupled and ensuring no changes
      have to be made in that particular function which helps with testing
      in this example I have a class called navigator which gives routes to user based on there modeOfTransport
      now I can return routes by keeping an if-else inside the getRoute function, however this leads t the above issue
      hence it's better to break this getRoute function into separate strategies, now if you have another modeOfTransport I have
      to make minimum changes in the existing code
      https://refactoring.guru/design-patterns/strategy
     */

    Navigator navigator = new Navigator();

    navigator.setNavigationStrategy("Bus");
    var busRoute = navigator.getRoute(2, 3);

    navigator.setNavigationStrategy("Car");
    var carRoute = navigator.getRoute(2, 3);

    navigator.setNavigationStrategy("Train");
    var trainRoute = navigator.getRoute(2, 3);

    navigator.setNavigationStrategy("Flight");
    var flightRoute = navigator.getRoute(2, 3);
  }
}
