package com.mycode.pract.designpattern.creational.singleton;

/**
 * Bill Pugh devised an approach to create Singleton class using inner static helper class.
 * Due to issues with Java memory model, if there are multiple threads, then each thread will
 * create instance simultaneously.
 * This is where Bill Pugh Singleton method works
 */
public class SingletonByBillPugh {

    private SingletonByBillPugh(){

    }

    private static class LazyHolder{
        private static final SingletonByBillPugh INSTANCE = new SingletonByBillPugh();
    }

    public static SingletonByBillPugh getInstance(){
        return LazyHolder.INSTANCE;
    }
}
