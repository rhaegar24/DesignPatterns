package org.lld;

import java.util.*;

public class Main {
  public static void main(String[] args) throws InterruptedException {

    /**
     * BUILDER DESIGN PATTERN
     * User user = new User.UserBuilder().setUserName("fuck").setUserId("you").build();
     * User user = User.builder().setUserName("fuck").setUserId("you").build();
     * System.out.println(user.toString());
     **/

    /**
     * IMMUTABLE CLASS
     * Engine e = new Engine(4);
     * System.out.println(e.toString());
     * Vehicle v = new Vehicle("SUV", e, "FORTUNER LEGENDER");
     * e.cylinders = 6;
     * System.out.println(e.toString());
     * System.out.println(v.toString());
     **/

    /**
      Engine e = new Engine(4);
      Engine e2 = e;

      System.out.println(e.equals(e2));
      e2.setCylinders(6);
      System.out.println(e.equals(e2));

      System.out.println(e.hashCode());
      System.out.println(e2.hashCode());
    **/

    /**
      MULTITHREADING
      ThreadTest t1 = new ThreadTest();
      t1.setName("Thread 1");
      ThreadTest t2 = new ThreadTest();
      t2.setName("Thread 2");
      ThreadTest t3 = new ThreadTest();
      t3.setName("Thread 3");

      t3.setPriority(5);
      t2.setPriority(6);
      t1.setPriority(7);

      t3.start();
      t1.start();
      t2.start();
     **/


    User2 user = User2.builder().setUserId("fuck").setUserEmail("you").build();


  }
}