package com.mycode.pract.designpattern.creational;

/**
 * double-checked locking method. It will recheck the instance variable in a synchronized block
 */
public class SingletonLazyDoubleCheck {
    private static volatile SingletonLazyDoubleCheck INSTANCE;

    private SingletonLazyDoubleCheck(){

    }

    public static SingletonLazyDoubleCheck getInstance(){
        if(null == INSTANCE){
            synchronized (SingletonLazyDoubleCheck.class){
                // Double check if instance is null or not
                if(null == INSTANCE){
                    INSTANCE = new SingletonLazyDoubleCheck();
                }
            }
        }
        return INSTANCE;
    }
}
