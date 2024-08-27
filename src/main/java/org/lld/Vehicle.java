package org.lld;

/**
 * This is an example of an immutable class
 * 1. this is final class => it cannot be inherited
 * 2. all the variables are final => there values once assigned cannot be changed
 * 3. there are no setters for the variables => variable values cannot be changed
 * 4. reference variable eg Engine, whenever its being set in the constructor a new object for it is being
 * created => deep copy the reference variable to ensure new memory is allocated to that reference
 * deep copy is important bc if that object is being passed in the constructor of the current class
 * and after current object is created that objects values are changed, then those changes will reflect in
 * current classes object as well
 */

public final class Vehicle {

    final String type;
    final Engine engine;
    final String name;

    public Vehicle(String type, Engine engine, String name) {
        this.type = type;
        this.engine = new Engine(engine.cylinders);
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "type='" + type + '\'' + ", engine=" + engine.toString() + ", name='" + name + '\'' + '}';
    }
}
