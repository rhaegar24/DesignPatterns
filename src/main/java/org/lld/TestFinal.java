package org.lld;

public class TestFinal {
  public static void main(String[] args) {
    Person p = new Person(69, "fuck");
    System.out.println(p.getId() + " " + p.getName());

    Person p2 = new Emp(70, "you", 700f);
    System.out.println(p2.getId() + " " + p2.getName());
  }
}

class Person {
  private final int id;
  private final String name;

  Person(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }
}

class Emp extends Person {
  float salary;

  Emp(int id, String name, float salary) {
    super(id, name);
    this.salary = salary;
  }
}
