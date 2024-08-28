package org.lld;

public class Subscriber implements Observer {

  String name;

  public Subscriber(String name) {
    this.name = name;
  }

  @Override
  public void notified() {
    System.out.println("new video uploaded " + this.name);
  }
}
