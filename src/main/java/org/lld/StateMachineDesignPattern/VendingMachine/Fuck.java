package org.lld.StateMachineDesignPattern.VendingMachine;

import java.util.concurrent.locks.ReentrantLock;

public class Fuck implements State{

    @Override
    public int getDiv() {
        return 0;
    }
}

class Test {
    public static void main(String[]args){
        State s = new Fuck();
        //s.getSum();
        System.out.println(s.getMultiplication());

        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        lock.unlock();
    }
}
