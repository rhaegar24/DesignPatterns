package org.lld;

public class Singleton {

  private static Singleton singleton;

  private Singleton(){
    if(singleton != null)
      throw new RuntimeException("Object already exists");
  }

  public static Singleton getObject() {
    if (singleton != null) return singleton;

    synchronized (Singleton.class) {
      singleton = new Singleton();
    }

    return singleton;
  }
}
