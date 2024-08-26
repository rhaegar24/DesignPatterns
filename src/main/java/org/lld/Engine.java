package org.lld;

public class Engine {
    Integer cylinders;

    public Engine(Integer cylinders) {
        this.cylinders = cylinders;
    }

    @Override
    public String toString() {
        return "Engine{" + "cylinders=" + cylinders + '}';
    }
}
