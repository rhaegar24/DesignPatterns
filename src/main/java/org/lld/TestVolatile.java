package org.lld;

public class TestVolatile {
  public static void main(String[] args) {

    ThreadTest2 thread1 = new ThreadTest2();
    ThreadTest2 thread2 = new ThreadTest2();

    System.out.println(Test.count);
    thread1.start();
    System.out.println(Test.count);
    thread2.start();
    System.out.println(Test.count);
  }
}

class Test {
  static volatile int count = 0;

  static void incrementCount() {
    ++count;
  }
}

class ThreadTest2 extends Thread {

  @Override
  public void run() {
    for (int i = 0; i < 5; i++) Test.incrementCount();
  }
}
