package org.lld;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

public class Main {
  public static void main(String[] args) throws InterruptedException, NoSuchMethodException, InvocationTargetException,
          InstantiationException, IllegalAccessException {

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
     * Engine e = new Engine(4);
     * Engine e2 = e;
     *
     * System.out.println(e.equals(e2));
     * e2.setCylinders(6);
     * System.out.println(e.equals(e2));
     *
     * System.out.println(e.hashCode());
     * System.out.println(e2.hashCode());
     **/

    /**
     * MULTITHREADING
     * ThreadTest t1 = new ThreadTest();
     * t1.setName("Thread 1");
     * ThreadTest t2 = new ThreadTest();
     * t2.setName("Thread 2");
     * ThreadTest t3 = new ThreadTest();
     * t3.setName("Thread 3");
     *
     * t3.setPriority(5);
     * t2.setPriority(6);
     * t1.setPriority(7);
     *
     * t3.start();
     * t1.start();
     * t2.start();
     **/

    /**
     * This is an example of observer design pattern
     * in this pattern whenever a change is made in the subject all of its objects(observers) are notified about the changes
     * this follows one-to-many relation
     * in our case we keep a Subject interface, and it has 3 functions
     * subscribe() where an observer can subscribe to the subject
     * unSubscribe() where an observer can subscribe to the subject
     * notifyChanges() where all the observers/subscribers are notified
     * there will be an Observer interface with just 1 method notified
     *
     *     Observer observer1 = new Subscriber("Cristiano");
     *     Observer observer2 = new Subscriber("Bale");
     *     Observer observer3 = new Subscriber("Benzema");
     *
     *     Subject subject = new YouTube();
     *     subject.subscribe(observer1);
     *     subject.subscribe(observer2);
     *     subject.subscribe(observer3);
     *
     *     subject.notifySubscribers();
     *
     */

    Set<String> set = new HashSet<>();
    set.add("fuck");
    Iterator<String> itr1 = set.iterator();
    Map<String, String> map = new HashMap<>();
    map.put("fuck", "you");
    Iterator<String> itr2 = map.keySet().iterator();

    /*
     Singleton singleton = Singleton.getObject();
     System.out.println(singleton.hashCode());
     Singleton singleton2 = Singleton.getObject();
     System.out.println(singleton2.hashCode());
     Singleton singleton3 = Singleton.getObject();
     System.out.println(singleton3.hashCode());

     Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
     constructor.setAccessible(true);
     Singleton singleton4 = constructor.newInstance();
     System.out.println(singleton4.hashCode());
     */

  }
}