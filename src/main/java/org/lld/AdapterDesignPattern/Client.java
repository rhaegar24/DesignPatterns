package org.lld.AdapterDesignPattern;

public class Client {

    public static void main(String [] args){
        //initially we had an apple charger
        //AppleCharger appleCharger = new LighteningCharger();

        //after we lost apple charger we got an android charger
        AndroidCharger androidCharger = new TypeCCharger();
        //now we have an android charger we need an adapter, make sure adapter is of type
        //appleCharger
        AppleCharger appleCharger = new Adapter(androidCharger);


        Iphone iphone = new Iphone(appleCharger);

        iphone.chargePhone();

    }
}
