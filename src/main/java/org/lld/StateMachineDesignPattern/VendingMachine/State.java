package org.lld.StateMachineDesignPattern.VendingMachine;

interface State {
    /**
     * use this interface to keep all the functions of all the states, implement the functions of the appropriate
     * states and throw exceptions in invalid functions
     */

    private int getSum() {
        return 2;
    }

    default int getMultiplication(){
        return getSum();
    }

    public abstract int getDiv();
}
