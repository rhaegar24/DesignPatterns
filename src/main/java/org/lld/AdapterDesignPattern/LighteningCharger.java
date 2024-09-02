package org.lld.AdapterDesignPattern;

public class LighteningCharger implements AppleCharger{

    @Override
    public void chargePhone() {
        System.out.println("Charging iphone");
    }
}
