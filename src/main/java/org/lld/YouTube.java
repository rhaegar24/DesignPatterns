package org.lld;

import java.util.ArrayList;
import java.util.List;

public class YouTube implements Subject {

  List<Observer> subscribersList;

  public YouTube() {
    this.subscribersList = new ArrayList<>();
  }

  @Override
  public void subscribe(Observer subscriber) {
    this.subscribersList.add(subscriber);
  }

  @Override
  public void unSubscribe(Observer subscriber) {
    this.subscribersList.remove(subscriber);
  }

  @Override
  public void notifySubscribers() {
    for (Observer subscriber : this.subscribersList) {
      subscriber.notified();
    }
  }
}
