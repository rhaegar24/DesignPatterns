package org.lld;

public class ThreadTest extends Thread {

  public void run() {
    try {
      for (int i = 0; i < 10; i++) {
        System.out.println(i);
        System.out.println(Thread.currentThread().getName());
        Thread.sleep(500);
      }
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    //System.out.println("Thread started " + Thread.currentThread());
  }
}
