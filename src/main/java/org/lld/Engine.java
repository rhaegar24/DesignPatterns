package org.lld;

import java.util.Objects;

public class Engine {
    Integer cylinders;

    public Engine(Integer cylinders) {
        this.cylinders = cylinders;
    }

    @Override
    public String toString() {
        return "Engine{" + "cylinders=" + cylinders + '}';
    }

    @Override
    public boolean equals(Object o) {
        Engine engine = (Engine) o;
        return this.cylinders.equals(engine.cylinders);
    }

    public void setCylinders(Integer cylinders) {
        this.cylinders = cylinders;
    }
}
