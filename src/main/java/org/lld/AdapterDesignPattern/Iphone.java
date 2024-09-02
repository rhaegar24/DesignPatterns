package org.lld.AdapterDesignPattern;

public class Iphone {

    AppleCharger charger;

    public Iphone(AppleCharger charger) {
        this.charger = charger;
    }

    void chargePhone(){
        charger.chargePhone();
    }
}
