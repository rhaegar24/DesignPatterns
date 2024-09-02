package org.lld.AdapterDesignPattern;

public class Adapter implements AppleCharger {

    AndroidCharger charger;

    public Adapter(AndroidCharger charger) {
        this.charger = charger;
    }

    @Override
    public void chargePhone() {
        charger.chargePhone();
    }
}
