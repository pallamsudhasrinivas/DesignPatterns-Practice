package com.mycode.pract.designpattern.creational.singleton;

/**
 * With Enum, only one instance is guaranteed.
 * It provides implicit support for thread safety and is a good way to have singleton with minimal effort
 */
public enum SingletonEnum {
    INSTANCE;

    public void someMethod(String param){
        // Some class members
    }
}
